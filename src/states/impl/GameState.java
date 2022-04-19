package states.impl;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class GameState {
    protected final String NAME;
    public GameState(String stateName){
        NAME=stateName;
    }
    public String name(){
        return NAME;
    }

    @Override
    public String toString() {
        return name();
    }

    public static GameState.Or or(GameState... states) {
        return new GameState.Or(states);
    }
    public static GameState.And and(GameState... states) {
        return new GameState.And(states);
    }

    public boolean isActive(GameStateContainer container){
        return container.isActive(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameState gameState = (GameState) o;
        return Objects.equals(name(), gameState.name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name());
    }

    public static class Or extends GameState{
        public Set<GameState> acceptedStates = new HashSet<>();
        public Or(GameState... states){
            super("OR");
            for (GameState state : states) {
                acceptedStates.add(state);
            }
        }
        public boolean isActive(GameStateContainer container){
            for (GameState acceptedState : acceptedStates) {
                if(acceptedState.isActive(container)){
                    return true;
                }
            }
            return false;
        }
        public void addAcceptedState(GameState... states) {
            for (GameState state : states) {
                acceptedStates.add(state);
            }
        }

        @Override
        public String name() {
            String ret = super.name();
            for (GameState acceptedState : acceptedStates) {
                ret+=acceptedState.name();
            }
            return ret;
        }
    }
    public static class And extends GameState{
        public Set<GameState> requiredStates = new HashSet<>();
        public And(GameState... states){
            super("AND");
            for (GameState state : states) {
                requiredStates.add(state);
            }
        }
        public boolean isActive(GameStateContainer container){
            for (GameState requiredState : requiredStates) {
                if(!requiredState.isActive(container)){
                    return false;
                }
            }
            return true;
        }
        public void addRequiredState(GameState... states){
            for (GameState state : states) {
                requiredStates.add(state);
            }
        }
        @Override
        public String name() {
            String ret = super.name();
            for (GameState requiredState : requiredStates) {
                ret+=requiredState.name();
            }
            return ret;
        }
    }
    public static class Incremental extends GameState{
        public GameState higherState;
        public Incremental(String name, GameState higherState){
            super(name);
            this.higherState = higherState;
        }
        public boolean isActive(GameStateContainer container){
            if(container.isActive(this)) return true;
            else if(higherState != null){
                return higherState.isActive(container);
            }
            else return false;
        }
    }
    public static class Tiered extends GameState{
        private final GameState.Incremental TIER;
        public Tiered(String name, GameState.Incremental tier){
            super(name);
            this.TIER=tier;
        }
        public GameState.Tiered withTier(GameState.Incremental tier){
            return new GameState.Tiered(NAME,tier);
        }
        public boolean isActive(GameStateContainer container){
            GameState currentTier = TIER;
            while(currentTier != null) {
                if (container.isActive("AND" + name() + currentTier.name())){
                    return true;
                }
                else if(currentTier instanceof Incremental) currentTier = ((Incremental) currentTier).higherState;
                else break;
            }
            return false;
        }

        @Override
        public String name() {
            return super.name();
        }
    }
}
