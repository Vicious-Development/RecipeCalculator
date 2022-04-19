package commands;
import calculator.Main;
import items.Item;
import states.impl.GameStateContainer;

public class GenerateRoster extends Command {
    public GenerateRoster(){
        super("genRoster");
    }
    public void execute(String... args){
        int num;
        Item item;
        for (int i = 0; i < args.length; i++) {
            if(i%2 == 1) Integer.parseInt(args[i]);
            else item = Main.stateContainer.getItem(args[i]);
        }
    }
}
