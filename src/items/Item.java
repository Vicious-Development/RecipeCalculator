package items;

import recipe.Recipe;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private static int nextId = 0;
    public String name;
    public int id;
    public List<Recipe> recipesYielding = new ArrayList<>();
    public Item(String name){
        id = nextId++;
        this.name=name;
    }
    public Item addRecipe(Recipe r){
        recipesYielding.add(r);
        return this;
    }
    public static Item gas(String name){
        return new Item("GAS:"+name);
    }
    public static Item fluid(String name){
        return new Item("FLUID:"+name);
    }
    public static Item solid(String name){
        return new Item(name);
    }
    public static Item durability(String name) {return new Item("TOOL:"+name);}
    public ItemStack stack(){
        return new ItemStack(this);
    }
    public ItemStack stack(int i){
        return new ItemStack(this,i);
    }
    public Recipe getRecipe() {
        Recipe best = null;
        for (Recipe recipe : recipesYielding) {
            if(recipe.isAvailable()){
                if(best != null){
                    if(recipe.priority > best.priority) best = recipe;
                }
                else best = recipe;
            }
        }
        if(best == null){
            throw new IllegalArgumentException("The following recipes are not usable in the game's current state, please enable the required gamestates! " + recipesYielding);
        }
        return best;
    }

    public boolean isRaw() {
        return recipesYielding.isEmpty();
    }
    public String toString(){
        return name;
    }
}
