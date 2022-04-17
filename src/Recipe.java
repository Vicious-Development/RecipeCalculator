import java.util.ArrayList;
import java.util.List;

public class Recipe {
    public List<ItemStack> inputs;
    public List<ItemStack> outputs;
    public String desc;
    public Recipe(List<ItemStack> in, List<ItemStack> out){
        inputs=in;
        outputs=out;
        for (ItemStack itemStack : out) {
            itemStack.item.addRecipe(this);
        }
    }
    public Recipe(ItemStack... items){
        inputs = new ArrayList<>();
        outputs = new ArrayList<>();
        boolean phase2 = false;
        for (ItemStack item : items) {
            if(!phase2 && items[items.length-1] != item){
                if(item == null || item.item == null) phase2=true;
                else inputs.add(item);
            }
            else{
                outputs.add(item);
                item.item.addRecipe(this);
            }
        }
    }

    public int getRequiredProcesses(ItemStack stack) {
        for (ItemStack output : outputs) {
            if(output.id() == stack.id()){
                return (int) Math.ceil((double)stack.size/(double)output.size);
            }
        }
        return 0;
    }
    public String toString(){
        String ret = desc;
        for (ItemStack input : inputs) {
            ret += input + ",";
        }
        ret += "YIELDS: ";
        for (ItemStack output : outputs) {
            ret += output + ",";
        }
        return ret;
    }
    public static Recipe crafting(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Crafting: ";
        return r;
    }
    public static Recipe smeltery(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Smeltery: ";
        return r;
    }
    public static Recipe chisel(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Chisel: ";
        return r;
    }
    public static Recipe pulverize(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Pulverize: ";
        return r;
    }
    public static Recipe wiremill(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Wiremilling: ";
        return r;
    }
    public static Recipe furnace(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Smelting: ";
        return r;
    }
    public static Recipe compacting(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Compacting: ";
        return r;
    }
    public static Recipe plateBending(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "PlateBending: ";
        return r;
    }
    public static Recipe lathe(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Lathing: ";
        return r;
    }
    public static Recipe alloySmelter(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "AlloySmelting: ";
        return r;
    }
    public static Recipe chemicalReactor(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "ChemicalReactor: ";
        return r;
    }
    public static Recipe plateSolidification(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "PlateSolidification: ";
        return r;
    }
    public static Recipe extracting(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Extracting: ";
        return r;
    }
    public static Recipe assembler(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Assembling: ";
        return r;
    }
}
