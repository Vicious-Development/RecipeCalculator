package items;

import recipe.Recipe;

public class ItemStack {
    public Item item;
    public int size;
    public ItemStack(Item i){
        item=i;
        size=1;
    }
    public ItemStack(Item i, int s){
        item=i;
        size=s;
    }
    public ItemStack clone(){
        return new ItemStack(item,size);
    }
    public Recipe getRecipe(){
        return item.getRecipe();
    }
    public boolean isRaw(){
        return item.isRaw();
    }
    public int id(){
        return item.id;
    }
    public String name(){
        return item.name;
    }
    public static ItemStack of(Item i, int size){
        return new ItemStack(i,size);
    }
    public static ItemStack of(Item i){
        return new ItemStack(i);
    }
    public String toString(){
        return "<" + size + "*" + item + ">";
    }
}
