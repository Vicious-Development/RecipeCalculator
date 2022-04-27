package states;

import states.impl.GameState;

import java.util.HashMap;
import java.util.Map;

public class GTNHGameStates {
    public static Map<String,GameState> states = new HashMap<>();
    public static <T extends GameState> T add(T state){
        states.put(state.name(),state);
        return state;
    }
    //Power tiers
    public static final GameState.Incremental UHV = add(new GameState.Incremental("UHV",null));
    public static final GameState.Incremental UV = add(new GameState.Incremental("UV",UHV));
    public static final GameState.Incremental ZPM = add(new GameState.Incremental("ZPM",UV));
    public static final GameState.Incremental LUV = add(new GameState.Incremental("LuV",ZPM));
    public static final GameState.Incremental IV = add(new GameState.Incremental("IV",LUV));
    public static final GameState.Incremental EV = add(new GameState.Incremental("EV",IV));
    public static final GameState.Incremental HV = add(new GameState.Incremental("HV",EV));
    public static final GameState.Incremental MV = add(new GameState.Incremental("MV",HV));
    public static final GameState.Incremental LV = add(new GameState.Incremental("LV",MV));
    public static final GameState.Incremental ULV = add(new GameState.Incremental("ULV",LV));
    public static final GameState.Incremental STEAM = add(new GameState.Incremental("STEAM",ULV));
    //Primitive
    public static final GameState PRIMITIVEBLASTFURNACE = add(new GameState("PRIMITIVE BLAST FURNACE"));
    public static final GameState COKEOVEN = add(new GameState("COKEOVEN"));
    //Machines
    public static final GameState.Tiered EXTRACTOR = add(new GameState.Tiered("EXTRACTOR",STEAM));
    public static final GameState.Tiered MACERATOR = add(new GameState.Tiered("MACERATOR",STEAM));
    public static final GameState.Tiered CENTRIFUGE = add(new GameState.Tiered("CENTRIFUGE",LV));
    public static final GameState.Tiered MIXER = add(new GameState.Tiered("MIXER",LV));
    public static final GameState.Tiered ALLOYSMELTER = add(new GameState.Tiered("ALLOY SMELTER",STEAM));
    public static final GameState.Tiered LATHE = add(new GameState.Tiered("LATHE",LV));
    public static final GameState.Tiered FLUIDSOLIDIFIER = add(new GameState.Tiered("FLUID SOLIDIFIER",LV));
    public static final GameState.Tiered FLUIDEXTRACTOR = add(new GameState.Tiered("FLUID EXTRACTOR",LV));
    public static final GameState.Tiered FLUIDCANNINGMACHINE = add(new GameState.Tiered("FLUID CANNING MACHINE",LV));
    public static final GameState.Tiered CHEMICALREACTOR = add(new GameState.Tiered("CHEMICAL REACTOR",LV));
    public static final GameState.Tiered OREWASHINGMACHINE = add(new GameState.Tiered("ORE WASHING MACHINE",LV));
    public static final GameState.Tiered THERMALCENTRIFUGE = add(new GameState.Tiered("THERMAL CENTRIFUGE",LV));
    public static final GameState.Tiered DISTILLERY = add(new GameState.Tiered("DISTILLERY",LV));
    public static final GameState.Tiered FORGEHAMMER = add(new GameState.Tiered("FORGE HAMMER",STEAM));
    public static final GameState.Tiered EXTRUDER = add(new GameState.Tiered("EXTRUDER",LV));
    public static final GameState.Tiered BENDINGMACHINE = add(new GameState.Tiered("BENDING MACHINE",LV));
    public static final GameState.Tiered WIREMILL = add(new GameState.Tiered("WIREMILL",LV));
    public static final GameState.Tiered ASSEMBLINGMACHINE = add(new GameState.Tiered("ASSEMBLING MACHINE",LV));
    public static final GameState.Tiered CIRCUITASSEMBLINGMACHINE = add(new GameState.Tiered("CIRCUIT ASSEMBLING MACHINE",LV));
    public static final GameState.Tiered ELECTROLYZER = add(new GameState.Tiered("ELECTROLYZER",LV));
    public static final GameState.Tiered COMPRESSOR = add(new GameState.Tiered("COMPRESSOR",STEAM));
    public static final GameState.Tiered ELECTRICFURNACE = add(new GameState.Tiered("ELECTRIC FURNACE",LV));
    public static final GameState.Tiered POLARIZER = add(new GameState.Tiered("POLARIZER",LV));
    public static final GameState.Tiered FORMINGPRESS = add(new GameState.Tiered("FORMING PRESS",LV));
    public static final GameState.Tiered CUTTINGMACHINE = add(new GameState.Tiered("CUTTING MACHINE",LV));
    public static final GameState.Tiered FLUIDHEATER = add(new GameState.Tiered("FLUID HEATER",LV));
    public static final GameState.Tiered ELECTRICBLASTFURNACE = add(new GameState.Tiered("ELECTRIC BLAST FURNACE",LV));
}
