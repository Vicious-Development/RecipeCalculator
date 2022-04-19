package recipe;

import items.Item;
import items.ItemStack;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RecipeRoster {
    public Map<Recipe,Integer> recipeCounts = new IdentityHashMap<>();
    public Map<Integer,RosterStack> itemsInvolved = new HashMap<>();
    public Map<Integer,RosterStack> netYield = new HashMap<>();
    public void clear(){
        itemsInvolved.clear();
        netYield.clear();
    }
    public void add(int toProduce, Item i){
        Recipe r = i.getRecipe();
        addByRecipe(r.getRequiredProcesses(i.stack(toProduce)),r);
    }
    public void addByItemStack(ItemStack stack){
        addByRecipe(stack.size,stack.getRecipe());
    }
    public void addByRecipe(int toProduce, Recipe recipe){
        addByRecipeRec(toProduce,recipe);
        List<Integer> toRemove = new ArrayList<>();
        for (RosterStack value : netYield.values()) {
            if(value.size <= 0){
                toRemove.add(value.id());
            }
        }
        for (Integer integer : toRemove) {
            netYield.remove(integer);
        }
    }
    private int addByRecipeRec(int toProduce, Recipe recipe){
        int thisLayer = 0;
        for (ItemStack input : recipe.inputs) {
            if(recipe.outputs.contains(input)){
                System.out.println("Fatal error: Circular recipe.Recipe detected: " + recipe);
                System.exit(0);
            }
            input = input.clone();
            input.size*=toProduce;
            if(input.isRaw()){
                addInput(input,0);
            }
            else{
                Recipe r  = input.getRecipe();
                ItemStack out = input.clone();
                out.size *= -1;
                addOutput(out);
                int recipesNeeded = r.getRequiredProcesses(input);
                if(netYield.get(out.id()).size < 0) {
                    int lyr = 1 + addByRecipeRec(recipesNeeded, r);
                    thisLayer = Math.max(lyr, thisLayer);
                }
                addInput(input, thisLayer);
            }
        }
        for (ItemStack output : recipe.outputs) {
            output = output.clone();
            output.size*=toProduce;
            addOutput(output);
        }
        addRecipe(recipe,toProduce);
        return thisLayer;
    }
    private void addRecipe(Recipe r, int count){
        Integer i = recipeCounts.get(r);
        if(i == null){
            recipeCounts.put(r,count);
        }
        else{
            recipeCounts.replace(r,i+count);
        }
    }
    private void addOutput(ItemStack output) {
        RosterStack i = netYield.get(output.id());
        if(i == null){
            netYield.put(output.id(),new RosterStack(output.item,output.size,0));
        }
        else i.size+=output.size;
    }

    public void addInput(ItemStack input, int layer) {
        RosterStack i = itemsInvolved.get(input.id());
        //Missing resources, must add as an input.
        if (i == null) {
            i = new RosterStack(input.item, input.size, layer);
            itemsInvolved.put(input.id(), i);
        } else {
            i.size += input.size;
        }
    }
    public String toString(){
        String ret = involves();
        ret+= "\n" + requiredRawMaterials();
        ret+= "\n" + yields();
        ret+= "\n" + recipeSteps();
        return ret;
    }
    public String recipeSteps(){
        StringBuilder ret = new StringBuilder("recipe.Recipe Steps: ");
        AtomicInteger total = new AtomicInteger(0);
        recipeCounts.forEach((k,v)->{
            total.getAndAdd(v);
            ret.append('\n').append(v).append(" * (").append(k).append(')');
        });
        ret.append("\nTotal Processes: ").append(total.get()).append("\nTotal Recipes: ").append(recipeCounts.size());
        return ret.toString();
    }
    public String yields(){
        String ret = "Yields: ";
        for (RosterStack value : netYield.values()) {
            ret += "\n" + value;
        }
        return ret;
    }

    /**
     * All the items involved in creating the final items.
     * These include the raw inputs as well as any items crafted from raw inputs EXCEPT the final outputs.
     */
    public String involves(){
        String ret = "Involves: ";
        for (RosterStack value : itemsInvolved.values()) {
            ret += "\n" + value;
        }
        return ret;
    }
    public String requiredRawMaterials(){
        String ret = "Raw Inputs: ";
        for (RosterStack value : itemsInvolved.values()) {
            if(value.layer == 0) ret += "\n" + value;
        }
        return ret;
    }
}
