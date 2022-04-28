package recipe;

import calculator.Main;
import items.ItemStack;
import states.impl.GameState;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    //The required state of the game that the recipe is tied to.
    //I.E. if the power tier is LV or the required machine is obtained.
    public List<GameState> requiredState = new ArrayList<>();
    public List<ItemStack> inputs;
    public List<ItemStack> outputs;
    public String desc;
    public int priority = 0;
    public Recipe(List<ItemStack> in, List<ItemStack> out){
        inputs=in;
        outputs=out;
        for (ItemStack itemStack : out) {
            itemStack.item.addRecipe(this);
        }
    }
    public Recipe addRequiredStates(GameState... states){
        for (GameState state : states) {
            requiredState.add(state);
        }
        return this;
    }
    public Recipe priority(int priority){
        this.priority=priority;
        return this;
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
    public boolean isAvailable() {
        for (GameState gameState : requiredState) {
            if(!gameState.isActive(Main.stateContainer)){
                return false;
            }
        }
        return true;
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

    /**
     * Info on Gamestates, All gamestates included here are using "or" states which can depend on multiple values.
     * This allows us to include multiple machines of the same name from different mods.
     * If you want to add a mod or modpack, add a class in the states package.
     * @param items
     * @return
     */
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
    public static Recipe compressing(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Compressor: ";
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
        r.desc = "AlloySmelter: ";
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
        r.desc = "Extractor: ";
        return r;
    }
    public static Recipe assembler(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Assembler: ";
        return r;
    }
    public static Recipe brickForming(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "BrickForming: ";
        return r;
    }
    public static Recipe mixing(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Mixer: ";
        return r;
    }
    public static Recipe centrifuging(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Centrifuge: ";
        return r;
    }
    public static Recipe polarize(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Polarize: ";
        return r;
    }
    public static Recipe formingPress(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "FormingPress: ";
        return r;
    }
    public static Recipe forgeHammer(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "ForgeHammer: ";
        return r;
    }
    public static Recipe extruding(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Extruding: ";
        return r;
    }
    public static Recipe cuttingMachine(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "CuttingMachine: ";
        return r;
    }
    public static Recipe ringSolidification(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "RingSolidification: ";
        return r;
    }
    public static Recipe rotorSolidification(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "RotorSolidification: ";
        return r;
    }
    public static Recipe distilling(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Distilling: ";
        return r;
    }
    public static Recipe fluidHeating(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "FluidHeating: ";
        return r;
    }
    public static Recipe electricBlasting(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "EBF: ";
        return r;
    }
    public static Recipe fluidCanning(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "FluidCanning: ";
        return r;
    }
    public static Recipe canning(ItemStack... items){
        Recipe r = new Recipe(items);
        r.desc = "Canning: ";
        return r;
    }
    public static Recipe fluidExtracting(ItemStack... items) {
        Recipe r = new Recipe(items);
        r.desc = "FluidExtractor: ";
        return r;
    }
    public static Recipe vacuumFreezing(ItemStack... items) {
        Recipe r = new Recipe(items);
        r.desc = "VacuumFreezing: ";
        return r;
    }
    public static Recipe chemicalBath(ItemStack... items) {
        Recipe r = new Recipe(items);
        r.desc = "ChemicalBath: ";
        return r;
    }
    public static Recipe arcFurnace(ItemStack... items) {
        Recipe r = new Recipe(items);
        r.desc = "ArcFurnace: ";
        return r;
    }
}
