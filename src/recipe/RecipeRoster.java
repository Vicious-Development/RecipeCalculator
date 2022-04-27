package recipe;

import items.GTNH;
import items.Item;
import items.ItemStack;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RecipeRoster {
    public Map<Recipe,RecipeUseStats> recipeUseData = new IdentityHashMap<>();
    public Map<Integer,ItemStack> itemsInvolved = new HashMap<>();
    public Map<Integer,ItemStack> netYield = new HashMap<>();
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
        for (ItemStack value : netYield.values()) {
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
                addInput(input);
            }
            else{
                Recipe r  = input.getRecipe();
                ItemStack out = input.clone();
                out.size *= -1;
                addOutput(out);
                int recipesNeeded = r.getRequiredProcesses(input);
                int lyr = 0;
                if(netYield.get(out.id()).size < 0) {
                    lyr = 1 + addByRecipeRec(recipesNeeded, r);
                }
                else{
                    RecipeUseStats rUS = recipeUseData.get(r);
                    if(rUS != null) {
                        lyr = 1 + rUS.order;
                    }
                }
                thisLayer = Math.max(lyr, thisLayer);
                addInput(input);

            }
        }
        for (ItemStack output : recipe.outputs) {
            output = output.clone();
            output.size*=toProduce;
            addOutput(output);
        }
        addRecipe(recipe,thisLayer,toProduce);
        return thisLayer;
    }
    private void addRecipe(Recipe r, int layer, int count){
        RecipeUseStats rs = recipeUseData.get(r);
        if(rs == null){
            rs = new RecipeUseStats(r);
            rs.numUses=count;
            rs.order=layer;
            recipeUseData.put(r,rs);
        }
        else{
            rs.numUses+=count;
            rs.order=Math.max(layer,rs.order);
        }
    }
    private void addOutput(ItemStack output) {
        ItemStack i = netYield.get(output.id());
        if(i == null){
            netYield.put(output.id(),new ItemStack(output.item,output.size));
        }
        else i.size+=output.size;
    }

    public void addInput(ItemStack input) {
        ItemStack i = itemsInvolved.get(input.id());
        //Missing resources, must add as an input.
        if (i == null) {
            i = new ItemStack(input.item, input.size);
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
        StringBuilder ret = new StringBuilder("Recipe Steps sorted deepest to shallowest: ");
        AtomicInteger total = new AtomicInteger(0);
        List<RecipeUseStats> sorted = new ArrayList<>();
        recipeUseData.forEach((k, v)->{
            total.getAndAdd(v.numUses);
            sorted.add(v);
        });
        sorted.sort(Comparator.comparingInt(rus -> rus.order));
        for (RecipeUseStats rUS : sorted) {
            ret.append('\n').append(rUS.numUses).append(" * (").append(rUS.recipe).append(')');
        }
        ret.append("\nTotal Processes: ").append(total.get()).append("\nTotal Recipes: ").append(recipeUseData.size());
        return ret.toString();
    }
    public String yields(){
        String ret = "Yields: ";
        for (ItemStack value : netYield.values()) {
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
        for (ItemStack value : itemsInvolved.values()) {
            ret += "\n" + value;
        }
        return ret;
    }
    public String requiredRawMaterials(){
        String ret = "Raw Inputs: ";
        for (ItemStack value : itemsInvolved.values()) {
            if(value.isRaw()) ret += "\n" + value;
        }
        return ret;
    }
}
