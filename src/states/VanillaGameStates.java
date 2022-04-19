package states;

import states.impl.GameState;

import java.util.HashMap;
import java.util.Map;

public class VanillaGameStates {
    public static Map<String,GameState> states = new HashMap<>();
    public static GameState add(GameState state){
        states.put(state.name(),state);
        return state;
    }
    public static final GameState FURNACE = add(new GameState("FURNACE"));
}
