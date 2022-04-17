public class Main {
    public static void main(String[] args){
        GTNH.init();
        RecipeRoster roster = LVSelfSustainingCombustionGenerator();
        System.out.println(roster);
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
        return roster;
    }
}
