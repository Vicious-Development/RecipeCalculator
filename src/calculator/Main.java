package calculator;

import items.GTNH;
import recipe.Recipe;
import recipe.RecipeRoster;
import states.impl.GameStateContainer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static GameStateContainer stateContainer = new GameStateContainer("GameStates.txt");
    public static void main(String[] args){
        GTNH.init();
        try {
            stateContainer.loadFromFile();
        } catch (FileNotFoundException e){
            try {
                Files.createFile(Paths.get("GameStates.txt"));
                System.out.println("GameStates.txt did not exist. It has been created. Put your gamestate scripts here.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        RecipeRoster roster = new RecipeRoster();//LVSelfSustainingCombustionGenerator();
        roster.add(4,GTNH.GOODELECTRONICCIRCUIT);
        System.out.println(roster);
        //System.out.println(ironTankQuest());
    }

    public static RecipeRoster ironTankQuest(){
        RecipeRoster roster = new RecipeRoster();
        roster.add(30,GTNH.IRONTANKWALL);
        roster.add(2,GTNH.IRONTANKVALVE);
        roster.add(2,GTNH.IRONTANKGAUGE);
        return roster;
    }
    /**
     * Oil pump quest
     */
    public static RecipeRoster oilPump(){
        RecipeRoster roster = new RecipeRoster();
        roster.add(1,GTNH.LVPUMPBLOCK);
        roster.add(64,GTNH.MININGPIPE);
        return roster;
    }

    /**
     * Provides the roster for a combustion generator running on light fuel.
     * Requires an external supply of water and oil.
     */
    public static RecipeRoster LVSelfSustainingCombustionGenerator(){
        RecipeRoster roster = new RecipeRoster();
        roster.add(1,GTNH.LVDISTILLERY);
        roster.add(6,GTNH.STEELFLUIDPIPE);
        roster.add(1,GTNH.LVELECTROLYZER);
        roster.add(1,GTNH.LVCHEMICALREACTOR);
        roster.add(1,GTNH.LVFLUIDCANNER);
        roster.add(1,GTNH.LVITEMFILTER);
        roster.add(2,GTNH.LVCOMBUSTIONGENERATOR);
        roster.add(8,GTNH.TINYTINITEMPIPE);
        roster.add(3,GTNH.ELECTRONICCIRCUIT);
        return roster;
    }
    /**
     * INITIAL EBF
     */
    public static RecipeRoster EBFQuest(){
        RecipeRoster roster = new RecipeRoster();
        roster.add(11,GTNH.HEATPROOFMACHINECASING);
        roster.add(1,GTNH.ELECTRICBLASTFURNACE);
        roster.add(1,GTNH.LVINPUTBUS);
        roster.add(1,GTNH.LVOUTPUTBUS);
        roster.add(1,GTNH.LVINPUTHATCH);
        roster.add(1,GTNH.MAINTENANCEHATCH);
        roster.add(1,GTNH.LVMUFFLERHATCH);
        roster.add(2,GTNH.LVENERGYHATCH);
        roster.add(16,GTNH.CUPRONICKELCOILBLOCK);
        return roster;
    }

}
