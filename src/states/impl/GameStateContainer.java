package states.impl;

import items.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.*;

public class GameStateContainer {
    public List<Class<?>> activeStateClasses = new ArrayList<>();
    public List<Class<?>> activeItemClasses = new ArrayList<>();
    public List<Map<String,Item>> items = new ArrayList<>();
    public List<Field> fields = new ArrayList<>();
    public Map<String,GameState> activeStates = new HashMap<>();
    public File stateFile;
    public GameStateContainer(String filePath){
        stateFile = new File(filePath);
    }
    public GameStateContainer addStates(GameState... states){
        for (GameState state : states) {
            activeStates.put(state.name(),state);
        }
        return this;
    }

    public boolean isActive(GameState gameState) {
        return activeStates.containsKey(gameState.name());
    }
    public boolean isActive(String gameState) {
        return activeStates.containsKey(gameState);
    }

    public void clear(){
        activeStates.clear();
    }
    public void loadFromFile() throws FileNotFoundException {
        Scanner scan = new Scanner(stateFile);
        List<String> cache = new ArrayList<>();
        Set<GameState> states = new HashSet<>();
        int mode = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            if(line.contains("loadStates(")){
                loadStateClasses(line);
                continue;
            }
            else if(line.contains("loadRecipes(")){
                loadRecipeClasses(line);
                continue;
            }
            StringBuilder val = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                //And
                if(c == '&'){
                    cache.add(val.toString());
                    val = new StringBuilder();
                    mode = 1;
                }
                //Or
                else if(c == '|'){
                    cache.add(val.toString());
                    val = new StringBuilder();
                    mode = 2;
                }
                //End of line or end of state.
                else if(c == ',' || c == '\n'){
                    cache.add(val.toString());
                    if(mode == 0){
                        for (String state : cache) {
                            states.add(getState(state));
                        }
                    }
                    else if(mode == 1){
                        GameState.And and = new GameState.And();
                        for (String state : cache) {
                            and.addRequiredState(getState(state));
                        }
                        val = new StringBuilder();
                        states.add(and);

                    }
                    else {
                        GameState.Or or = new GameState.Or();
                        for (String state : cache) {
                            or.addAcceptedState(getState(state));
                        }
                        val = new StringBuilder();
                        states.add(or);
                    }
                    mode = 0;
                    cache.clear();
                }
                else{
                    val.append(c);
                }
            }
        }
        for (GameState state : states) {
            activeStates.put(state.name(),state);
        }
        fields.clear();
    }
    private void loadStateClasses(String line){
        try {
            activeStateClasses.add(Class.forName(line.substring(line.indexOf('(')+1,line.indexOf(')'))));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void loadRecipeClasses(String line){
        try {
            activeItemClasses.add(Class.forName(line.substring(line.indexOf('(')+1,line.indexOf(')'))));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reflectively gets a state from the loaded state classes.
     */
    private GameState getState(String state){
        if(fields.isEmpty()){
            for (Class<?> activeStateClass : activeStateClasses) {
                try {
                    fields.add(activeStateClass.getDeclaredField("states"));
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
        }
        for (Field field : fields) {
            try {
                Map<String,GameState> stateMap = (Map<String, GameState>) field.get(field.getDeclaringClass());
                if(stateMap.containsKey(state)){
                    return stateMap.get(state);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        throw new IllegalArgumentException(state + " is not a state that exists in any of your loaded state classes.");
    }
    public Item getItem(String name){
        if(items.isEmpty()){
            for (Class<?> activeItemClass : activeItemClasses) {
                try {
                    items.add((Map<String, Item>) activeItemClass.getDeclaredField("items").get(activeItemClass));
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        for (Map<String, Item> itemMap : items) {
            if(itemMap.containsKey(name)){
                return itemMap.get(name);
            }
        }
        throw new IllegalArgumentException(name + " is not an item that exists in any of your loaded item classes.");
    }

    @Override
    public String toString() {
        return "GameStateContainer{" +
                "\nactiveStateClasses=" + activeStateClasses +
                ", \nactiveItemClasses=" + activeItemClasses +
                ", \nitems=" + items +
                ", \nfields=" + fields +
                ", \nactiveStates=" + activeStates +
                ", \nstateFile=" + stateFile +
                "\n}";
    }
}
