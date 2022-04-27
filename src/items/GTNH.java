package items;

import recipe.Recipe;
import states.GTNHGameStates;

import java.util.HashMap;
import java.util.Map;

public class GTNH {
    public static Map<String,Item> items = new HashMap<>();
    public static Item add(Item i){
        items.put(i.name,i);
        return i;
    }
    //Vanilla
    public static final Item STICK = add(Item.solid("STICK"));
    public static final Item PLANK = add(Item.solid("PLANK"));
    public static final Item LOG = add(Item.solid("LOG"));
    public static final Item GLASS = add(Item.solid("GLASS"));
    public static final Item SAND = add(Item.solid("SAND"));
    public static final Item GRAVEL = add(Item.solid("GRAVEL"));
    public static final Item FLINT = add(Item.solid("FLINT"));
    public static final Item REDSTONE = add(Item.solid("REDSTONE"));
    public static final Item COAL = add(Item.solid("COAL"));
    public static final Item IRONBARS = add(Item.solid("IRONBARS"));
    public static final Item CHEST = add(Item.solid("CHEST"));
    public static final Item CLAYBALL = add(Item.solid("CLAYBALL"));
    public static final Item BRICKS = add(Item.solid("BRICKS"));
    public static final Item BRICK = add(Item.solid("BRICK"));
    public static final Item FURNACE = add(Item.solid("FURNACE"));
    public static final Item GLASSPANE = add(Item.solid("GLASSPANE"));
    public static final Item COBBLESTONE = add(Item.solid("COBBLESTONE"));
    //Represents any form of a bucket of water. Use WATER for millibuckets
    public static final Item BUCKETOFWATER = add(Item.fluid("BUCKETOFWATER"));
    public static final Item WATER = add(Item.fluid("WATER"));
    //CHISEL
    public static final Item ANDESITE = add(Item.fluid("ANDESITE"));
    //IC2
    public static final Item STICKYRESIN = add(Item.solid("STICKYRESIN"));
    public static final Item PLANTBALL = add(Item.solid("PLANTBALL"));
    //Buildcraft
    public static final Item BCTANK = add(Item.solid("BCTANK"));
    //TiC
    public static final Item CLEARGLASS = add(Item.solid("CLEARGLASS"));
    static void glass(){
        Recipe.chisel(CLEARGLASS.stack(),GLASS.stack());
    }
    //Railcraft
    public static final Item IRONTANKWALL = add(Item.solid("IRONTANKWALL"));
    public static final Item STEELTANKWALL = add(Item.solid("STEELTANKWALL"));
    public static final Item IRONTANKVALVE = add(Item.solid("IRONTANKVALVE"));
    public static final Item STEELTANKVALVE = add(Item.solid("STEELTANKVALVE"));
    public static final Item IRONTANKGAUGE = add(Item.solid("IRONTANKGAUGE"));
    public static final Item STEELTANKGAUGE = add(Item.solid("STEELTANKGAUGE"));
    public static final Item STEELBARS = add(Item.solid("STEELBARS"));


    //GT
    //FLUIDS
    public static final Item MOLTENRUBBERINGOT = add(Item.fluid("RUBBERINGOT"));
    //Tools
    public static final Item TOOLSAW = add(Item.durability("SAW"));
    public static final Item TOOLHAMMER = add(Item.durability("HAMMER"));
    public static final Item TOOLWIRECUTTERS = add(Item.durability("WIRECUTTERS"));
    public static final Item TOOLFILE = add(Item.durability("FILE"));
    public static final Item TOOLWRENCH = add(Item.durability("WRENCH"));
    public static final Item TOOLSCREWDRIVER = add(Item.durability("SCREWDRIVER"));
    public static final Item TOOLKNIFE = add(Item.durability("KNIFE"));
    public static final Item TOOLMORTAR = add(Item.durability("MORTAR"));
    public static final Item TOOLCROWBAR = add(Item.durability("TOOLCROWBAR"));
    public static final Item TOOLSOFTMALLET = add(Item.durability("TOOLSOFTMALLET"));
    //NUGGETS
    public static final Item IRONNUGGET = add(Item.solid("IRONNUGGET"));
    public static final Item WROUGHTIRONNUGGET = add(Item.solid("WROUGHTIRONNUGGET"));
    //INGOTS
    public static final Item TININGOT = add(Item.solid("TININGOT"));
    public static final Item IRONINGOT = add(Item.solid("IRONINGOT"));
    public static final Item ZINCINGOT = add(Item.solid("ZINCINGOT"));
    public static final Item COPPERINGOT = add(Item.solid("COPPERINGOT"));
    public static final Item STEELINGOT = add(Item.solid("STEELINGOT"));
    public static final Item GOLDINGOT = add(Item.solid("GOLDINGOT"));
    public static final Item SILVERINGOT = add(Item.solid("SILVERINGOT"));
    public static final Item ANTIMONYINGOT = add(Item.solid("ANTIMONYINGOT"));
    public static final Item LEADINGOT = add(Item.solid("LEADINGOT"));
    public static final Item REDALLOYINGOT = add(Item.solid("REDALLOYINGOT"));
    public static final Item BRONZEINGOT = add(Item.solid("BRONZEINGOT"));
    public static final Item WROUGHTIRONINGOT = add(Item.solid("WROUGHTIRONINGOT"));
    public static final Item BRASSINGOT = add(Item.solid("BRASSINGOT"));
    public static final Item ALUMINUMINGOT = add(Item.solid("ALUMINUMINGOT"));
    public static final Item COBALTBRASSINGOT = add(Item.solid("COBALTBRASSINGOT"));
    public static final Item BATTERYALLOYINGOT = add(Item.solid("BATTERYALLOYINGOT"));
    public static final Item INVARINGOT = add(Item.solid("INVARINGOT"));
    public static final Item NICKELINGOT = add(Item.solid("NICKELINGOT"));
    public static final Item CUPRONICKELINGOT = add(Item.solid("CUPRONICKELINGOT"));
    public static final Item REDSTONEALLOYINGOT = add(Item.solid("REDSTONEALLOYINGOT"));
    static void ingots(){
        Recipe.crafting(IRONINGOT.stack(),TOOLSAW.stack(),IRONNUGGET.stack(9));
        Recipe.furnace(IRONNUGGET.stack(),WROUGHTIRONNUGGET.stack());
        Recipe.compressing(WROUGHTIRONNUGGET.stack(9),WROUGHTIRONINGOT.stack());
        Recipe.alloySmelter(COPPERINGOT.stack(),REDSTONE.stack(4),REDALLOYINGOT.stack()).addRequiredStates(GTNHGameStates.ALLOYSMELTER);
        Recipe.alloySmelter(COPPERINGOT.stack(3),TININGOT.stack(),BRONZEINGOT.stack(4)).addRequiredStates(GTNHGameStates.ALLOYSMELTER).priority(100);
        Recipe.alloySmelter(LEADINGOT.stack(4),ANTIMONYINGOT.stack(),BATTERYALLOYINGOT.stack(5)).addRequiredStates(GTNHGameStates.ALLOYSMELTER).priority(100);
        Recipe.alloySmelter(IRONINGOT.stack(2),NICKELINGOT.stack(),INVARINGOT.stack(3)).addRequiredStates(GTNHGameStates.ALLOYSMELTER).priority(100);
        Recipe.electricBlasting(REDSTONEALLOYDUST.stack(),REDSTONEALLOYINGOT.stack()).addRequiredStates(GTNHGameStates.ELECTRICBLASTFURNACE);
    }
    //Bricks
    public static final Item UNFIREDCLAYBRICK = add(Item.solid("UNFIREDCLAYBRICK"));
    public static final Item COMPRESSEDFIRECLAY = add(Item.solid("COMPRESSEDFIRECLAY"));
    public static final Item FIREBRICK = add(Item.solid("FIREBRICK"));
    public static final Item FIREBRICKS = add(Item.solid("FIREBRICKS"));
    //DUST TINY
    public static final Item TINYFLINTDUST = add(Item.solid("TINYFLINTDUST"));
    //DUST SMALL
    public static final Item SMALLIRONDUST = add(Item.solid("SMALLIRONDUST"));
    public static final Item SMALLTINDUST = add(Item.solid("SMALLTINDUST"));
    public static final Item SMALLSTEELDUST = add(Item.solid("SMALLSTEELDUST"));
    public static final Item SMALLREDALLOYDUST = add(Item.solid("SMALLREDALLOYDUST"));
    public static final Item SMALLCLAYDUST = add(Item.solid("SMALLCLAYDUST"));
    public static final Item SMALLBRICKDUST = add(Item.solid("SMALLBRICKDUST"));
    public static final Item SMALLCOBALTBRASSDUST = add(Item.solid("SMALLCOBALTBRASSDUST"));
    public static final Item SMALLDIAMONDUST = add(Item.solid("SMALLDIAMONDUST"));
    public static final Item SMALLCARBONDUST = add(Item.solid("SMALLCARBONDUST"));
    public static final Item SMALLBRONZEDUST = add(Item.solid("SMALLBRONZEDUST"));
    public static final Item SMALLINVARDUST = add(Item.solid("SMALLINVARDUST"));

    //DUST NORMAL
    public static final Item FLINTDUST = add(Item.solid("FLINTDUST"));
    public static final Item DUSTRAWRUBBER = add(Item.solid("DUSTRAWRUBBER"));
    public static final Item DUSTSULFUR = add(Item.solid("DUSTSULFUR"));
    public static final Item QUARTZSAND = add(Item.solid("QUARTZSAND"));
    public static final Item GLASSDUST = add(Item.solid("GLASSDUST"));
    public static final Item WOODPULP = add(Item.solid("WOODPULP"));
    public static final Item COALDUST = add(Item.solid("COALDUST"));
    public static final Item CLAYDUST = add(Item.solid("CLAYDUST"));
    public static final Item BRICKDUST = add(Item.solid("BRICKDUST"));
    public static final Item FIRECLAYDUST = add(Item.solid("FIRECLAYDUST"));
    public static final Item STONEDUST = add(Item.solid("STONEDUST"));
    public static final Item CALCITEDUST = add(Item.solid("CALCITEDUST"));
    public static final Item GYPSUMDUST = add(Item.solid("GYPSUMDUST"));
    public static final Item BRONZEDUST = add(Item.solid("BRONZEDUST"));
    public static final Item TINDUST = add(Item.solid("TINDUST"));
    public static final Item COPPERDUST = add(Item.solid("COPPERDUST"));
    public static final Item ZINCDUST = add(Item.solid("ZINCDUST"));
    public static final Item COBALTDUST = add(Item.solid("COBALTDUST"));
    public static final Item BRASSDUST = add(Item.solid("BRASSDUST"));
    public static final Item ALUMINUMDUST = add(Item.solid("ALUMINUMDUST"));
    public static final Item COBALTBRASSDUST = add(Item.solid("COBALTBRASSDUST"));
    public static final Item SILICONDIOXIDEDUST = add(Item.solid("SILICONDIOXIDEDUST"));
    public static final Item ASBESTOSDUST = add(Item.solid("ASBESTOSDUST"));
    public static final Item MICABASEDPULP = add(Item.solid("MICABASEDPULP"));
    public static final Item MICADUST = add(Item.solid("MICADUST"));
    public static final Item SILICONDUST = add(Item.solid("SILICONDUST"));
    public static final Item PYRITEDUST = add(Item.solid("PYRITEDUST"));
    public static final Item RUBYDUST = add(Item.solid("RUBYDUST"));
    public static final Item REDSTONEALLOYDUST = add(Item.solid("REDSTONEALLOYDUST"));
    static void dusts(){
        //Wood pulp
        Recipe.crafting(LOG.stack(),TOOLMORTAR.stack(),WOODPULP.stack(2));
        Recipe.pulverize(LOG.stack(),WOODPULP.stack(8)).addRequiredStates(GTNHGameStates.MACERATOR).priority(Integer.MAX_VALUE);
        //Glass Dust
        Recipe.crafting(QUARTZSAND.stack(),TINYFLINTDUST.stack(),GLASSDUST.stack());
        Recipe.mixing(FLINTDUST.stack(),QUARTZSAND.stack(16),GLASSDUST.stack(16)).addRequiredStates(GTNHGameStates.MIXER).priority(Integer.MAX_VALUE);
        //QUARTZSAND
        Recipe.crafting(SAND.stack(),TOOLMORTAR.stack(),QUARTZSAND.stack());
        //FLINTDUST
        Recipe.pulverize(FLINT.stack(2),FLINTDUST.stack()).addRequiredStates(GTNHGameStates.MACERATOR);
        Recipe.crafting(FLINTDUST.stack(),TINYFLINTDUST.stack(9));
        //Raw rubber
        Recipe.extracting(STICKYRESIN.stack(),DUSTRAWRUBBER.stack(3)).addRequiredStates(GTNHGameStates.EXTRACTOR);
        Recipe.centrifuging(STICKYRESIN.stack(),null,DUSTRAWRUBBER.stack(3),PLANTBALL.stack(),GLUE.stack(100)).addRequiredStates(GTNHGameStates.CENTRIFUGE).priority(100);
        //Coal Dust
        Recipe.crafting(COAL.stack(),TOOLMORTAR.stack(),COALDUST.stack());
        Recipe.pulverize(COAL.stack(),COALDUST.stack(1)).addRequiredStates(GTNHGameStates.MACERATOR).priority(100);
        //Clay dust
        Recipe.pulverize(CLAYBALL.stack(),TOOLMORTAR.stack(),SMALLCLAYDUST.stack(1));
        Recipe.pulverize(CLAYBALL.stack(),SMALLCLAYDUST.stack(2)).addRequiredStates(GTNHGameStates.MACERATOR).priority(100);
        Recipe.crafting(SMALLCLAYDUST.stack(4),CLAYDUST.stack());
        //Brick dust
        Recipe.crafting(BRICKDUST.stack(),CLAYDUST.stack(),FIRECLAYDUST.stack(2));
        Recipe.pulverize(BRICKS.stack(),BRICKDUST.stack()).addRequiredStates(GTNHGameStates.MACERATOR).priority(100);
        Recipe.crafting(SMALLBRICKDUST.stack(4),BRICKDUST.stack());
        Recipe.crafting(BRICK.stack(),TOOLMORTAR.stack(),SMALLBRICKDUST.stack());
        //Tin dust
        Recipe.crafting(TININGOT.stack(),TOOLMORTAR.stack(),TINDUST.stack());
        Recipe.pulverize(TININGOT.stack(),TINDUST.stack()).addRequiredStates(GTNHGameStates.MACERATOR).priority(100);
        //Copper dust
        Recipe.crafting(COPPERINGOT.stack(),TOOLMORTAR.stack(),COPPERDUST.stack());
        Recipe.pulverize(COPPERINGOT.stack(),COPPERDUST.stack()).addRequiredStates(GTNHGameStates.MACERATOR).priority(100);
        //Zinc dust
        Recipe.crafting(ZINCINGOT.stack(),TOOLMORTAR.stack(),ZINCDUST.stack());
        Recipe.pulverize(ZINCINGOT.stack(),ZINCDUST.stack()).addRequiredStates(GTNHGameStates.MACERATOR).priority(100);
        //Brass dust
        Recipe.crafting(COPPERDUST.stack(3),ZINCDUST.stack(1),BRASSDUST.stack(3));
        Recipe.mixing(COPPERDUST.stack(3),ZINCDUST.stack(1),BRASSDUST.stack(4)).addRequiredStates(GTNHGameStates.MIXER).priority(100);
        //Cobalt Brass Dust
        Recipe.crafting(BRASSDUST.stack(7),ALUMINUMDUST.stack(),COBALTDUST.stack(),COBALTBRASSDUST.stack(8));
        Recipe.mixing(BRASSDUST.stack(7),ALUMINUMDUST.stack(),COBALTDUST.stack(),COBALTBRASSDUST.stack(9)).addRequiredStates(GTNHGameStates.MIXER).priority(100);
        //Cobalt Brass ingot
        Recipe.furnace(COBALTBRASSDUST.stack(),COBALTBRASSINGOT.stack());
        //Bronze ingot 2
        Recipe.crafting(TINDUST.stack(1),COPPERDUST.stack(3),BRONZEDUST.stack(3));
        Recipe.furnace(BRONZEDUST.stack(),BRONZEINGOT.stack());
        //Brass Ingot
        Recipe.furnace(BRASSDUST.stack(),BRASSINGOT.stack());
        Recipe.alloySmelter(COPPERINGOT.stack(3),ZINCINGOT.stack(),BRASSINGOT.stack()).addRequiredStates(GTNHGameStates.ALLOYSMELTER).priority(100);
        //Silicon Dioxide Dust
        Recipe.pulverize(ANDESITE.stack(),SILICONDIOXIDEDUST.stack());
        //Mica Based Pulp
        Recipe.mixing(MICADUST.stack(3),STICKYRESIN.stack(),MICABASEDPULP.stack(4));
        //Cupronickel
        Recipe.alloySmelter(COPPERINGOT.stack(),NICKELINGOT.stack(),CUPRONICKELINGOT.stack(2));
        Recipe.centrifuging(REDSTONE.stack(10),null,SILICONDUST.stack(),PYRITEDUST.stack(5),RUBYDUST.stack(),MERCURYCELL.stack(3)).addRequiredStates(GTNHGameStates.CENTRIFUGE);
        //Redstone alloy
        Recipe.mixing(REDSTONE.stack(),SILICONDUST.stack(),COALDUST.stack(),REDSTONEALLOYDUST.stack(3)).addRequiredStates(GTNHGameStates.MIXER);

    }
    //FLUIDS
    public static final Item BUCKETOFCONCRETE = add(Item.fluid("BUCKETOFCONCRETE"));
    public static final Item FLUIDCONCRETE = add(Item.fluid("CONCRETE"));
    public static final Item GLUE = add(Item.fluid("GLUE"));
    public static final Item MOLTENTIN = add(Item.fluid("TIN"));
    public static final Item MOLTENTININGOT = add(Item.fluid("TININGOT"));
    public static final Item MOLTENLEAD = add(Item.fluid("LEAD"));
    public static final Item MOLTENLEADINGOT = add(Item.fluid("LEADINGOT"));
    public static final Item ETHYLENE = add(Item.fluid("ETHYLENE"));
    public static final Item POLYETHYLENE = add(Item.fluid("POLYETHYLENE"));
    public static final Item OXYGENCELL = add(Item.fluid("OXYGENCELL"));
    public static final Item STEAM = add(Item.fluid("STEAM"));
    public static final Item LIGHTFUEL = add(Item.fluid("LIGHTFUEL"));
    public static final Item STEAMCELL = add(Item.fluid("STEAMCELL"));
    public static final Item CREOSOTECELL = add(Item.fluid("CREOSOTECELL"));
    public static final Item LUBRICANTCELL = add(Item.fluid("LUBRICANTCELL"));
    public static final Item SEVERELYSTEAMCRACKEDLIGHTFUELCELL = add(Item.fluid("SEVERELYSTEAMCRACKEDLIGHTFUELCELL"));
    public static final Item SEVERELYSTEAMCRACKEDLIGHTFUEL = add(Item.fluid("SEVERELYSTEAMCRACKEDLIGHTFUEL"));
    public static final Item MERCURY = add(Item.fluid("MERCURY"));
    public static final Item MERCURYCELL = add(Item.fluid("MERCURYCELL"));
    static void fluids(){
        Recipe.distilling(CREOSOTECELL.stack(25),LUBRICANTCELL.stack(8)).addRequiredStates(GTNHGameStates.DISTILLERY);
        Recipe.chemicalReactor(ETHYLENE.stack(144),OXYGENCELL.stack(),POLYETHYLENE.stack(216)).addRequiredStates(GTNHGameStates.CHEMICALREACTOR);
        Recipe.chemicalReactor(LIGHTFUEL.stack(1000),STEAMCELL.stack(1),SEVERELYSTEAMCRACKEDLIGHTFUEL.stack(250));
        Recipe.fluidHeating(BUCKETOFWATER.stack(6),STEAM.stack(960));
        Recipe.distilling(SEVERELYSTEAMCRACKEDLIGHTFUEL.stack(1000), SMALLCARBONDUST.stack(3),ETHYLENE.stack(250));
    }
    //RODS
    public static final Item IRONROD = add(Item.solid("IRONROD"));
    public static final Item TINROD = add(Item.solid("TINROD"));
    public static final Item REDALLOYROD = add(Item.solid("REDALLOYROD"));
    public static final Item MAGNETICIRONROD = add(Item.solid("MAGNETICIRONROD"));
    public static final Item STEELROD = add(Item.solid("STEELROD"));
    public static final Item COBALTBRASSROD = add(Item.solid("COBALTBRASSROD"));
    public static final Item BRONZEROD = add(Item.solid("BRONZEROD"));
    public static final Item INVARROD = add(Item.solid("INVARROD"));
    static void rods(){
        rod(IRONINGOT,IRONROD,SMALLIRONDUST);
        rod(TININGOT,TINROD,SMALLTINDUST);
        rod(REDALLOYINGOT,REDALLOYROD,SMALLREDALLOYDUST);
        rod(STEELINGOT,STEELROD,SMALLSTEELDUST);
        rod(COBALTBRASSINGOT,COBALTBRASSROD,SMALLCOBALTBRASSDUST);
        rod(BRONZEINGOT,BRONZEROD,SMALLBRONZEDUST);
        rod(INVARINGOT,INVARROD,SMALLINVARDUST);
        Recipe.crafting(IRONROD.stack(),REDSTONE.stack(4),MAGNETICIRONROD.stack());
        Recipe.polarize(IRONROD.stack(),MAGNETICIRONROD.stack()).addRequiredStates(GTNHGameStates.POLARIZER).priority(100);
    }
    static void rod(Item ingot, Item rod, Item smallDust){
        Recipe.crafting(ingot.stack(),TOOLFILE.stack(),rod.stack());
        Recipe.lathe(ingot.stack(),null,rod.stack(),smallDust.stack(2)).priority(100).addRequiredStates(GTNHGameStates.LATHE);

    }
    //Balls
    public static final Item GLASSTUBE = add(Item.solid("GLASSTUBE"));
    static void balls(){
        Recipe.alloySmelter(GLASSDUST.stack(),GLASSTUBE.stack()).addRequiredStates(GTNHGameStates.ALLOYSMELTER);
        Recipe.formingPress(GLASSDUST.stack(),GLASSTUBE.stack()).addRequiredStates(GTNHGameStates.FORMINGPRESS).priority(100);
    }
    //Plates
    public static final Item IRONPLATE = add(Item.solid("IRONPLATE"));
    public static final Item COPPERPLATE = add(Item.solid("COPPERPLATE"));
    public static final Item TINPLATE = add(Item.solid("TINPLATE"));
    public static final Item STEELPLATE = add(Item.solid("STEELPLATE"));
    public static final Item WROUGHTIRONPLATE = add(Item.solid("WROUGHTIRONPLATE"));
    public static final Item GOLDPLATE = add(Item.solid("GOLDPLATE"));
    public static final Item ZINCPLATE = add(Item.solid("ZINCPLATE"));
    public static final Item BRONZEPLATE = add(Item.solid("BRONZEPLATE"));
    public static final Item RUBBERSHEET = add(Item.solid("RUBBERSHEET"));
    public static final Item WOODPLANK = add(Item.solid("WOODPLANK"));
    public static final Item REDALLOYPLATE = add(Item.solid("REDALLOYPLATE"));
    public static final Item COBALTBRASSPLATE = add(Item.solid("COBALTBRASSPLATE"));
    public static final Item BATTERYALLOYPLATE = add(Item.solid("BATTERYALLOYPLATE"));
    public static final Item REDSTONEALLOYPLATE = add(Item.solid("REDSTONEALLOYPLATE"));
    public static final Item INVARPLATE = add(Item.solid("INVARPLATE"));
    public static final Item CUPRONICKELPLATE = add(Item.solid("CUPRONICKELPLATE"));
    public static final Item MICABASEDSHEET = add(Item.solid("MICABASEDSHEET"));
    public static final Item MICAINSULATORPLATE = add(Item.solid("MICAINSULATORPLATE"));
    //Double
    public static final Item DOUBLESTEELPLATE = add(Item.solid("DOUBLESTEELPLATE"));
    static void plates(){
        plate(WROUGHTIRONINGOT,WROUGHTIRONPLATE);
        plate(IRONINGOT,IRONPLATE);
        plate(COPPERINGOT,COPPERPLATE);
        plate(STEELINGOT,STEELPLATE);
        plate(TININGOT,TINPLATE);
        plate(BRONZEINGOT,BRONZEPLATE);
        plate(ZINCINGOT,ZINCPLATE);
        plate(REDALLOYINGOT,REDALLOYPLATE);
        plate(COBALTBRASSINGOT,COBALTBRASSPLATE);
        plate(BATTERYALLOYINGOT,BATTERYALLOYPLATE);
        plate(INVARINGOT,INVARPLATE);
        plate(CUPRONICKELINGOT,CUPRONICKELPLATE);
        plate(REDALLOYINGOT,REDALLOYPLATE);
        Recipe.formingPress(MICABASEDPULP.stack(4),ASBESTOSDUST.stack(),MICABASEDSHEET.stack(4)).addRequiredStates(GTNHGameStates.FORMINGPRESS);
        Recipe.alloySmelter(MICABASEDSHEET.stack(4),SILICONDIOXIDEDUST.stack()).addRequiredStates(GTNHGameStates.ALLOYSMELTER);
        Recipe.crafting(STEELPLATE.stack(2),TOOLHAMMER.stack(),DOUBLESTEELPLATE.stack());
        Recipe.compressing(WOODPULP.stack(8),WOODPLANK.stack());
        Recipe.plateSolidification(MOLTENRUBBERINGOT.stack(),RUBBERSHEET.stack());
        Recipe.alloySmelter(MICABASEDSHEET.stack(4),SILICONDIOXIDEDUST.stack(),MICAINSULATORPLATE.stack(4)).addRequiredStates(GTNHGameStates.ALLOYSMELTER);
    }
    static void plate(Item ingot, Item plate){
        Recipe.plateBending(ingot.stack(),plate.stack()).priority(100).addRequiredStates(GTNHGameStates.BENDINGMACHINE);
        Recipe.forgeHammer(ingot.stack(3),plate.stack(2)).priority(50).addRequiredStates(GTNHGameStates.FORGEHAMMER);
        Recipe.crafting(ingot.stack(2),plate.stack(1));
    }
    //Foil
    public static final Item ZINCFOIL = add(Item.solid("ZINCFOIL"));
    public static final Item COPPERFOIL = add(Item.solid("COPPERFOIL"));
    public static final Item MICAINSULATORFOIL = add(Item.solid("MICAINSULATORFOIL"));
    static void foils(){
        foilBending(ZINCPLATE,ZINCFOIL);
        foilBending(COPPERPLATE,COPPERFOIL);
        foilBending(MICAINSULATORPLATE,MICAINSULATORFOIL);
    }
    static void foilBending(Item plate, Item foil){
        Recipe.plateBending(plate.stack(),foil.stack(4)).priority(100).addRequiredStates(GTNHGameStates.BENDINGMACHINE);
        Recipe.crafting(plate.stack(1),foil.stack(2));
    }
    //CASING
    public static final Item STEELCASING = add(Item.solid("STEELCASING"));
    static void plateCasings(){
        casingBending(STEELINGOT,STEELCASING);
    }
    static void casingBending(Item ingot, Item casing){
        Recipe.alloySmelter(ingot.stack(2),casing.stack(3)).addRequiredStates(GTNHGameStates.ALLOYSMELTER);
        Recipe.extruding(ingot.stack(1),casing.stack(2)).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV)).priority(100);
    }
    //BOLTS
    public static final Item TINBOLT = add(Item.solid("TINBOLT"));
    public static final Item IRONBOLT = add(Item.solid("IRONBOLT"));
    public static final Item BRONZEBOLT = add(Item.solid("BRONZEBOLT"));
    public static final Item REDALLOYBOLT = add(Item.solid("REDALLOYBOLT"));
    public static final Item STEELBOLT = add(Item.solid("STEELBOLT"));
    static void bolts(){
        bolt(TINROD,TININGOT,TINBOLT);
        bolt(IRONROD,IRONINGOT,IRONBOLT);
        bolt(BRONZEROD,BRONZEINGOT,BRONZEBOLT);
        bolt(REDALLOYROD,REDALLOYINGOT,REDALLOYBOLT);
    }
    static void bolt(Item rod, Item ingot, Item bolt){
        Recipe.crafting(rod.stack(),TOOLSAW.stack(),bolt.stack(2));
        Recipe.cuttingMachine(rod.stack(),bolt.stack(4)).priority(50).addRequiredStates(GTNHGameStates.CUTTINGMACHINE);
        Recipe.extruding(ingot.stack(),bolt.stack(8)).priority(100).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV));
    }
    //SCREWS
    public static final Item TINSCREW = add(Item.solid("TINSCREW"));
    public static final Item BRONZESCREW = add(Item.solid("BRONZESCREW"));
    public static final Item IRONSCREW = add(Item.solid("IRONSCREW"));
    public static final Item STEELSCREW = add(Item.solid("STEELSCREW"));
    public static final Item REDALLOYSCREW = add(Item.solid("REDALLOYSCREW"));
    static void screws(){
        screw(TINBOLT,TINSCREW);
        screw(IRONBOLT,IRONSCREW);
        screw(BRONZEBOLT,BRONZESCREW);
        screw(STEELBOLT,STEELSCREW);
        screw(REDALLOYBOLT,REDALLOYSCREW);
    }
    static void screw(Item bolt, Item screw){
        Recipe.crafting(bolt.stack(2),TOOLFILE.stack(),screw.stack());
        Recipe.lathe(bolt.stack(1),screw.stack(1)).priority(100).addRequiredStates(GTNHGameStates.LATHE);
    }
    //RING
    public static final Item TINRING = add(Item.solid("TINRING"));
    public static final Item BRONZERING = add(Item.solid("BRONZERING"));
    public static final Item RUBBERRING = add(Item.solid("RUBBERRING"));
    static void rings(){
        ring(TINROD,TININGOT,TINRING);
        ring(BRONZEROD,BRONZEINGOT,BRONZERING);
        softRing(RUBBERSHEET,RUBBERRING);
        Recipe.ringSolidification(MOLTENRUBBERINGOT.stack(),RUBBERRING.stack(4)).addRequiredStates(GTNHGameStates.FLUIDSOLIDIFIER).priority(100);
    }
    static void ring(Item rod, Item ingot, Item ring){
        Recipe.crafting(TOOLHAMMER.stack(),TOOLFILE.stack(),rod.stack(),ring.stack());
        Recipe.extruding(ingot.stack(),ring.stack(4)).priority(100).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV));
    }
    static void softRing(Item plate, Item ring){
        Recipe.crafting(TOOLKNIFE.stack(),plate.stack(),ring.stack());
    }

    //ROTOR
    public static final Item TINROTOR = add(Item.solid("TINROTOR"));
    public static final Item BRONZEROTOR = add(Item.solid("BRONZEROTOR"));
    static void rotors(){
        rotor(TINSCREW,TINRING,TINPLATE,TINROTOR);
        rotor(BRONZESCREW,BRONZERING,TINPLATE,BRONZEROTOR);
    }
    static void rotor(Item screw, Item ring, Item plate, Item rotor){
        Recipe.crafting(plate.stack(4),screw.stack(),ring.stack(),TOOLHAMMER.stack(),TOOLFILE.stack(),TOOLSCREWDRIVER.stack(),null,rotor.stack());
        Recipe.rotorSolidification(MOLTENTIN.stack(612),TINROTOR.stack()).priority(100).addRequiredStates(GTNHGameStates.FLUIDSOLIDIFIER.withTier(GTNHGameStates.MV));
        Recipe.assembler(TINRING.stack(),TINPLATE.stack(4),MOLTENLEAD.stack(48),TINROTOR.stack()).priority(50).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE);
    }
    //Wires
    public static final Item COPPERWIRE1 = add(Item.solid("COPPERWIRE1"));
    public static final Item COPPERWIRE2 = add(Item.solid("COPPERWIRE2"));
    public static final Item COPPERWIRE4 = add(Item.solid("COPPERWIRE4"));
    public static final Item REDSTONEALLOYWIRE1 = add(Item.solid("REDSTONEALLOYWIRE1"));
    public static final Item REDSTONEALLOYWIRE2 = add(Item.solid("REDSTONEALLOYWIRE2"));
    public static final Item REDSTONEALLOYWIRE4 = add(Item.solid("REDSTONEALLOYWIRE4"));
    public static final Item REDSTONEALLOYWIRE8 = add(Item.solid("REDSTONEALLOYWIRE8"));
    public static final Item REDSTONEALLOYWIRE12 = add(Item.solid("REDSTONEALLOYWIRE12"));
    public static final Item REDSTONEALLOYWIRE16 = add(Item.solid("REDSTONEALLOYWIRE16"));
    public static final Item REDSTONEALLOYCABLE16 = add(Item.solid("REDSTONEALLOYCABLE16"));
    public static final Item COPPERCABLE1 = add(Item.solid("COPPERCABLE1"));
    public static final Item TINWIRE1 = add(Item.solid("TINWIRE1"));
    public static final Item TINWIRE2 = add(Item.solid("TINWIRE2"));
    public static final Item TINCABLE1 = add(Item.solid("TINCABLE1"));
    public static final Item REDALLOYWIRE1 = add(Item.solid("REDALLOYWIRE1"));
    public static final Item REDALLOYCABLE1 = add(Item.solid("REDALLOYCABLE1"));
    public static final Item GOLDWIRE1 = add(Item.solid("GOLDWIRE1"));
    public static final Item STEELWIRE1 = add(Item.solid("STEELWIRE1"));
    public static final Item CUPRONICKELWIRE1 = add(Item.solid("CUPRONICKELWIRE1"));
    public static final Item CUPRONICKELWIRE2 = add(Item.solid("CUPRONICKELWIRE2"));
    static void wires(){
        wire(COPPERINGOT,COPPERPLATE,COPPERWIRE1);
        Recipe.crafting(COPPERWIRE1.stack(2),COPPERWIRE2.stack());
        Recipe.crafting(COPPERWIRE1.stack(4),COPPERWIRE4.stack());
        Recipe.crafting(COPPERWIRE1.stack(),RUBBERSHEET.stack(),COPPERCABLE1.stack());
        wire(TININGOT,TINPLATE,TINWIRE1);
        Recipe.crafting(TINWIRE1.stack(2),TINWIRE2.stack());
        Recipe.crafting(TINWIRE1.stack(),RUBBERSHEET.stack(),TINCABLE1.stack());
        wire(REDALLOYINGOT,REDALLOYPLATE,REDALLOYWIRE1);
        Recipe.crafting(REDALLOYWIRE1.stack(),RUBBERSHEET.stack(),REDALLOYCABLE1.stack());
        wire(STEELINGOT,STEELPLATE,STEELWIRE1);
        wire(GOLDINGOT,GOLDPLATE,GOLDWIRE1);
        wire(CUPRONICKELINGOT,CUPRONICKELPLATE,CUPRONICKELWIRE1);
        wire(REDSTONEALLOYINGOT,REDSTONEALLOYPLATE,REDSTONEALLOYWIRE1);
        Recipe.crafting(REDSTONEALLOYWIRE1.stack(2),REDSTONEALLOYWIRE2.stack());
        Recipe.crafting(REDSTONEALLOYWIRE1.stack(4),REDSTONEALLOYWIRE4.stack());
        Recipe.crafting(REDSTONEALLOYWIRE1.stack(8),REDSTONEALLOYWIRE8.stack());
        Recipe.crafting(REDSTONEALLOYWIRE4.stack(1),REDSTONEALLOYWIRE8.stack(),REDSTONEALLOYWIRE12.stack());
        Recipe.crafting(REDSTONEALLOYWIRE8.stack(2),REDSTONEALLOYWIRE16.stack());
        Recipe.assembler(REDSTONEALLOYWIRE16.stack(),MOLTENRUBBERINGOT.stack(5),REDSTONEALLOYCABLE16.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE);
        Recipe.crafting(CUPRONICKELWIRE1.stack(2),CUPRONICKELWIRE2.stack());
    }
    static void wire(Item ingot, Item plate, Item wire){
        Recipe.crafting(plate.stack(),TOOLWIRECUTTERS.stack(),wire.stack());
        Recipe.wiremill(ingot.stack(),wire.stack(2)).addRequiredStates(GTNHGameStates.WIREMILL).priority(100);
    }
    //Fine Wire
    public static final Item FINESTEELWIRE = add(Item.solid("FINESTEELWIRE"));
    public static final Item FINECOPPERWIRE = add(Item.solid("FINECOPPERWIRE"));
    static void finewires(){
        Recipe.wiremill(COPPERWIRE1.stack(), FINECOPPERWIRE.stack(4));
        Recipe.wiremill(STEELWIRE1.stack(), FINESTEELWIRE.stack(4));
    }
    static void finewire(Item foil, Item wire, Item fineWire){
        Recipe.crafting(foil.stack(),TOOLWIRECUTTERS.stack(),fineWire.stack());
        Recipe.wiremill(wire.stack(), fineWire.stack(4)).priority(100).addRequiredStates(GTNHGameStates.WIREMILL);
    }
    //FRAME BOXES
    public static final Item INVARFRAMEBOX = add(Item.solid("INVARFRAMEBOX"));
    static void frameBoxes(){
        Recipe.crafting(INVARROD.stack(8),TOOLWRENCH.stack(),INVARFRAMEBOX.stack(2));
    }
    //Batteries
    public static final Item SMALLBATTERYHULL = add(Item.solid("SMALLBATTERYHULL"));
    public static void batteries(){
        Recipe.crafting(BATTERYALLOYPLATE.stack(2),TINCABLE1.stack(), TOOLFILE.stack(),TOOLHAMMER.stack(),TOOLSAW.stack(),SMALLBATTERYHULL.stack());
    }
    //Gear
    public static final Item SMALLSTEELGEAR = add(Item.solid("SMALLSTEELGEAR"));
    public static final Item STEELGEAR = add(Item.solid("STEELGEAR"));
    public static final Item COBALTBRASSGEAR = add(Item.solid("COBALTBRASSGEAR"));
    static void gears(){
        Recipe.crafting(TOOLHAMMER.stack(),TOOLWIRECUTTERS.stack(),STEELROD.stack(2),STEELPLATE.stack(),SMALLSTEELGEAR.stack());
        Recipe.extruding(STEELINGOT.stack(),SMALLSTEELGEAR.stack()).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV)).priority(100);
        Recipe.crafting(STEELPLATE.stack(4),STEELROD.stack(4),STEELGEAR.stack());
        Recipe.alloySmelter(STEELINGOT.stack(8),STEELGEAR.stack()).addRequiredStates(GTNHGameStates.ALLOYSMELTER).priority(50);
        Recipe.extruding(STEELINGOT.stack(4),STEELGEAR.stack()).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV)).priority(100);
        Recipe.crafting(COBALTBRASSPLATE.stack(4),COBALTBRASSROD.stack(4),COBALTBRASSGEAR.stack());
        Recipe.alloySmelter(COBALTBRASSINGOT.stack(8),COBALTBRASSGEAR.stack()).addRequiredStates(GTNHGameStates.ALLOYSMELTER).priority(50);
        Recipe.extruding(COBALTBRASSINGOT.stack(4),COBALTBRASSGEAR.stack()).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV)).priority(100);

    }
    //Pipes
    public static final Item BRONZEFLUIDPIPE = add(Item.solid("BRONZEFLUIDPIPE"));
    public static final Item LARGEBRONZEFLUIDPIPE = add(Item.solid("LARGEBRONZEFLUIDPIPE"));
    public static final Item STEELFLUIDPIPE = add(Item.solid("STEELFLUIDPIPE"));
    public static final Item HUGESTEELFLUIDPIPE = add(Item.solid("HUGESTEELFLUIDPIPE"));
    public static final Item LARGESTEELFLUIDPIPE = add(Item.solid("LARGESTEELFLUIDPIPE"));
    public static final Item SMALLSTEELFLUIDPIPE = add(Item.solid("SMALLSTEELFLUIDPIPE"));
    public static final Item TINYTINITEMPIPE = add(Item.solid("TINYTINITEMPIPE"));
    public static final Item LONGDISTANCEFLUIDPIPE = add(Item.solid("LONGDISTANCEFLUIDPIPE"));
    public static final Item LONGDISTANCEFLUIDPIPELINE = add(Item.solid("LONGDISTANCEFLUIDPIPELINE"));
    //TODO:Add MV Extruding pipe recipes.
    static void pipes(){
        pipe(BRONZEPLATE,BRONZEFLUIDPIPE);
        pipe(STEELPLATE,STEELFLUIDPIPE);
        Recipe.crafting(TINPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),TINYTINITEMPIPE.stack(8));
        Recipe.crafting(BRONZEPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),LARGEBRONZEFLUIDPIPE.stack());
        Recipe.crafting(STEELPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),SMALLSTEELFLUIDPIPE.stack(6));
        Recipe.crafting(STEELPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),LARGESTEELFLUIDPIPE.stack(1));
        Recipe.crafting(DOUBLESTEELPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),HUGESTEELFLUIDPIPE.stack(1));
        Recipe.crafting(STEELPLATE.stack(6),TOOLWRENCH.stack(),LARGESTEELFLUIDPIPE.stack(2),LONGDISTANCEFLUIDPIPE.stack(32));
        Recipe.crafting(STEELGEAR.stack(4),HUGESTEELFLUIDPIPE.stack(2),STEELPLATE.stack(2),TOOLWRENCH.stack(),LONGDISTANCEFLUIDPIPELINE.stack(1));
        Recipe.assembler(STEELGEAR.stack(1),HUGESTEELFLUIDPIPE.stack(1),STEELPLATE.stack(3),MOLTENTIN.stack(72),LONGDISTANCEFLUIDPIPELINE.stack(1)).priority(100).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE);
    }
    static void pipe(Item plate, Item pipe){
        Recipe.crafting(plate.stack(6),TOOLWRENCH.stack(),TOOLHAMMER.stack(),pipe.stack(2));
    }
    //Primitive Blast Furnace
    public static final Item PRIMITIVEBLASTFURNACE = add(Item.solid("PRIMITIVEBLASTFURNACE"));
    //CIRCUITBOARDS
    public static final Item LVCIRCUITBOARD = add(Item.solid("LVCIRCUITBOARD"));
    public static final Item COATEDCIRCUITBOARD = add(Item.solid("COATEDCIRCUITBOARD"));
    //CIRCUITS
    public static final Item ELECTRONICCIRCUIT = add(Item.solid("ELECTRONICCIRCUIT"));
    public static final Item VACUUMTUBE = add(Item.solid("VACUUMTUBE"));
    public static final Item RESISTOR = add(Item.solid("RESISTOR"));
    //TODO: add assembler options.
    static void circuits(){
        Recipe.crafting(WOODPLANK.stack(),STICKYRESIN.stack(2),COATEDCIRCUITBOARD.stack());
        Recipe.crafting(COPPERWIRE1.stack(8),COATEDCIRCUITBOARD.stack(),LVCIRCUITBOARD.stack());
        Recipe.crafting(REDALLOYBOLT.stack(),COPPERWIRE1.stack(3),FINECOPPERWIRE.stack(2),STEELROD.stack(2),GLASSTUBE.stack(),VACUUMTUBE.stack());
        Recipe.crafting(COALDUST.stack(),COPPERWIRE1.stack(2),FINECOPPERWIRE.stack(2),STICKYRESIN.stack(2),RESISTOR.stack());
        Recipe.crafting(REDALLOYWIRE1.stack(3),VACUUMTUBE.stack(2),LVCIRCUITBOARD.stack(),RESISTOR.stack(2),STEELCASING.stack(),ELECTRONICCIRCUIT.stack());
    }
    //CASING
    public static final Item LVMACHINECASING = add(Item.solid("LVMACHINECASING"));
    static void casings(){
        casing(STEELPLATE,LVMACHINECASING);
    }
    static void casing(Item plate, Item casing){
        Recipe.crafting(plate.stack(8),TOOLWRENCH.stack(),null,casing.stack());
    }
    //MACHINE HULLS
    public static final Item LVMACHINEHULL = add(Item.solid("LVMACHINEHULL"));
    static void hulls(){
        hull(LVMACHINECASING,STEELPLATE,WROUGHTIRONPLATE,TINCABLE1,LVMACHINEHULL);
    }
    static void hull(Item casing, Item plate1, Item plate2, Item cable, Item hull){
        Recipe.crafting(plate1.stack(),plate2.stack(2),cable.stack(2),casing.stack(),null,hull.stack());
    }
    //MOTORS
    public static final Item LVMOTOR = add(Item.solid("LVMOTOR"));
    static void motors(){
        motorNotLuV(COPPERWIRE1,TINCABLE1,MAGNETICIRONROD,IRONROD,LVMOTOR);
    }
    static void motorNotLuV(Item wire, Item cable, Item magnetRod, Item rod, Item motor){
        Recipe.crafting(cable.stack(2),wire.stack(4),magnetRod.stack(),rod.stack(2),null,motor.stack());
    }
    //Conveyors
    public static final Item LVCONVEYOR = add(Item.solid("LVCONVEYOR"));
    static void conveyors(){
        Recipe.crafting(RUBBERSHEET.stack(6),LVMOTOR.stack(2),TINCABLE1.stack(),LVCONVEYOR.stack());
    }
    //PISTONS
    public static final Item LVPISTON = add(Item.solid("LVPISTON"));
    static void pistons(){
        piston(STEELROD,SMALLSTEELGEAR,STEELPLATE,LVMOTOR,TINCABLE1,LVPISTON);
    }
    static void piston(Item rod, Item smallGear, Item plate, Item motor, Item cable, Item piston){
        Recipe.crafting(rod.stack(2),smallGear.stack(),plate.stack(3),cable.stack(2),motor.stack(),piston.stack());
    }
    //PUMP
    public static final Item LVPUMP = add(Item.solid("LVPUMP"));
    static void pumps(){
        pumpLessIV(TINROTOR,TINSCREW,TINCABLE1,LVMOTOR,BRONZEFLUIDPIPE,LVPUMP);
    }
    static void pumpLessIV(Item rotor, Item screw, Item cable, Item motor, Item pipe, Item pump){
        Recipe.crafting(screw.stack(),rotor.stack(),cable.stack(),RUBBERRING.stack(2),pipe.stack(),motor.stack(),TOOLSCREWDRIVER.stack(),TOOLWRENCH.stack(),pump.stack());
    }
    //items.Item Filters
    public static final Item ITEMFILTER = add(Item.solid("ITEMFILTER"));
    public static final Item LVITEMFILTER = add(Item.solid("LVITEMFILTER"));
    static void itemFilters(){
        Recipe.assembler(FINESTEELWIRE.stack(64),ZINCFOIL.stack(16),ITEMFILTER.stack());
        Recipe.crafting(CHEST.stack(),ELECTRONICCIRCUIT.stack(),LVCONVEYOR.stack(),LVMACHINEHULL.stack(),ITEMFILTER.stack(),LVITEMFILTER.stack());
    }
    //Canning Machines
    public static final Item LVFLUIDCANNER = add(Item.solid("LVFLUIDCANNER"));
    public static final Item LVCANNINGMACHINE = add(Item.solid("LVCANNINGMACHINE"));
    static void canners(){
        Recipe.crafting(GLASS.stack(4),TINCABLE1.stack(2),LVPUMP.stack(),LVMACHINEHULL.stack(),ELECTRONICCIRCUIT.stack(), LVFLUIDCANNER.stack());
        Recipe.crafting(GLASS.stack(3),TINCABLE1.stack(2),LVPUMP.stack(),LVMACHINEHULL.stack(),ELECTRONICCIRCUIT.stack(2), LVCANNINGMACHINE.stack());
    }
    //Distillery
    public static final Item LVDISTILLERY = add(Item.solid("LVDISTILLERY"));
    static void distilleries(){
        Recipe.crafting(ELECTRONICCIRCUIT.stack(2),BRONZEFLUIDPIPE.stack(),GLASS.stack(2),LVPUMP.stack(),TINCABLE1.stack(2),LVMACHINEHULL.stack(),LVDISTILLERY.stack());
    }
    //Electrolyzer
    public static final Item LVELECTROLYZER = add(Item.solid("LVELECTROLYZER"));
    static void electrolyzers(){
        Recipe.crafting(GOLDWIRE1.stack(4),GLASS.stack(),ELECTRONICCIRCUIT.stack(2),TINCABLE1.stack(),LVMACHINEHULL.stack(),LVELECTROLYZER.stack());
    }
    //Chemical Reactor
    public static final Item LVCHEMICALREACTOR = add(Item.solid("LVCHEMICALREACTOR"));
    static void chemicalReactors(){
        Recipe.crafting(ELECTRONICCIRCUIT.stack(2),TINROTOR.stack(),LVMOTOR.stack(),TINCABLE1.stack(2),GLASS.stack(2),LVMACHINEHULL.stack(),LVCHEMICALREACTOR.stack());
    }
    //Combustion Generators
    public static final Item LVCOMBUSTIONGENERATOR = add(Item.solid("LVCOMBUSTIONGENERATOR"));
    static void combustionGenerators(){
        Recipe.crafting(LVPISTON.stack(2),LVMOTOR.stack(2),ELECTRONICCIRCUIT.stack(),LVMACHINEHULL.stack(),TINCABLE1.stack(),STEELGEAR.stack(2),LVCOMBUSTIONGENERATOR.stack());
    }
    //Alloy Smelters
    public static final Item LVALLOYSMELTER = add(Item.solid("LVALLOYSMELTER"));
    static void alloySmelters(){
        Recipe.crafting(COPPERWIRE4.stack(4),TINCABLE1.stack(2),ELECTRONICCIRCUIT.stack(2),LVMACHINEHULL.stack(),LVALLOYSMELTER.stack());
    }
    //Pump Blocks
    public static final Item MININGPIPE = add(Item.solid("MININGPIPE"));
    public static final Item LVPUMPBLOCK = add(Item.solid("LVPUMPBLOCK"));
    static void pumpBlocks(){
        Recipe.wiremill(SMALLSTEELFLUIDPIPE.stack(),MININGPIPE.stack(2));
        Recipe.crafting(LVPUMP.stack(4),LARGEBRONZEFLUIDPIPE.stack(2),ELECTRONICCIRCUIT.stack(2),LVMACHINEHULL.stack(),LVPUMPBLOCK.stack());
    }
    //Furnaces
    public static final Item IRONFURNACE = add(Item.solid("IRONFURNACE"));
    static void furnaces(){
        Recipe.crafting(COBBLESTONE.stack(6),FLINT.stack(3),FURNACE.stack());
        Recipe.crafting(IRONPLATE.stack(7),FURNACE.stack(),TOOLWRENCH.stack(),IRONFURNACE.stack());
    }
    //Sifters
    public static final Item LVSIFTER = add(Item.solid("LVSIFTER"));
    static void sifters(){
        Recipe.crafting(ITEMFILTER.stack(2),TINCABLE1.stack(2),LVPISTON.stack(2),ELECTRONICCIRCUIT.stack(2),LVMACHINEHULL.stack(),LVSIFTER.stack());
    }
    //Mixers
    public static final Item LVMIXER = add(Item.solid("LVMIXER"));
    static void mixers(){
        Recipe.crafting(ELECTRONICCIRCUIT.stack(2),LVMACHINEHULL.stack(),GLASS.stack(4),TINROTOR.stack(),LVMOTOR.stack(),LVMIXER.stack());
    }
    //Cutting Machines
    public static final Item DIAMONDSAWBLADE = add(Item.solid("DIAMONDSAWBLADE"));
    public static final Item LVCUTTINGMACHINE = add(Item.solid("LVCUTTINGMACHINE"));
    static void cuttingMachines(){
        Recipe.crafting(COBALTBRASSGEAR.stack(),SMALLDIAMONDUST.stack(4),DIAMONDSAWBLADE.stack());
        Recipe.crafting(DIAMONDSAWBLADE.stack(),LVMOTOR.stack(),TINCABLE1.stack(2),LVCONVEYOR.stack(),LVMACHINEHULL.stack(),GLASS.stack(),ELECTRONICCIRCUIT.stack(2),LVCUTTINGMACHINE.stack());
    }
    //Fluid Extractors
    public static final Item LVFLUIDEXTRACTOR = add(Item.solid("LVFLUIDEXTRACTOR"));
    static void fluidExtractors(){
        Recipe.crafting(ELECTRONICCIRCUIT.stack(2),TINCABLE1.stack(2),LVPISTON.stack(),LVPUMP.stack(),LVMACHINEHULL.stack(),GLASS.stack(2),LVFLUIDEXTRACTOR.stack());
    }
    //Fluid Heaters
    public static final Item LVFLUIDHEATER = add(Item.solid("LVFLUIDHEATER"));
    static void fluidHeaters(){
        Recipe.crafting(ELECTRONICCIRCUIT.stack(),TINCABLE1.stack(2),LVPUMP.stack(2),COPPERWIRE4.stack(2),LVMACHINEHULL.stack(),GLASS.stack(), LVFLUIDHEATER.stack());
    }
    //Forming presses
    public static final Item LVFORMINGPRESS = add(Item.solid("LVFORMINGPRESS"));
    static void formingPresses(){
        Recipe.crafting(LVPISTON.stack(2),TINCABLE1.stack(4),ELECTRONICCIRCUIT.stack(2),LVMACHINEHULL.stack(), LVFORMINGPRESS.stack());
    }
    //Polarizer
    public static final Item LVPOLARIZER = add(Item.solid("LVPOLARIZER"));
    static void polarizers(){
        Recipe.crafting(TINWIRE2.stack(4),TINWIRE1.stack(2),IRONROD.stack(2),LVMACHINEHULL.stack(),LVPOLARIZER.stack());
    }
    //Centrifuge
    public static final Item LVCENTRIFUGE = add(Item.solid("LVCENTRIFUGE"));
    static void centrifuges(){
        Recipe.crafting(ELECTRONICCIRCUIT.stack(4),TINCABLE1.stack(2),LVMOTOR.stack(2),LVMACHINEHULL.stack(),LVCENTRIFUGE.stack());
    }
    //EBF
    public static final Item HEATPROOFMACHINECASING = add(Item.solid("HEATPROOFMACHINECASING"));
    public static final Item ELECTRICBLASTFURNACE = add(Item.solid("ELECTRICBLASTFURNACE"));
    public static final Item LVINPUTBUS = add(Item.solid("LVINPUTBUS"));
    public static final Item LVOUTPUTBUS = add(Item.solid("LVOUTPUTBUS"));
    public static final Item LVINPUTHATCH = add(Item.solid("LVINPUTHATCH"));
    public static final Item LVMUFFLERHATCH = add(Item.solid("LVMUFFLERHATCH"));
    public static final Item MAINTENANCEHATCH = add(Item.solid("MAINTENANCEHATCH"));
    public static final Item CUPRONICKELCOILBLOCK = add(Item.solid("CUPRONICKELCOILBLOCK"));
    public static final Item LVENERGYHATCH = add(Item.solid("LVENERGYHATCH"));
    public static final Item LVCOIL = add(Item.solid("LVCOIL"));


    public static void ebf(){
        Recipe.assembler(MAGNETICIRONROD.stack(),FINESTEELWIRE.stack(16),LVCOIL.stack());
        Recipe.crafting(INVARPLATE.stack(6),INVARFRAMEBOX.stack(),TOOLHAMMER.stack(),TOOLWRENCH.stack(), HEATPROOFMACHINECASING.stack());
        Recipe.crafting(IRONFURNACE.stack(3), HEATPROOFMACHINECASING.stack(),ELECTRONICCIRCUIT.stack(3),TINCABLE1.stack(2),ELECTRICBLASTFURNACE.stack());
        Recipe.assembler(CHEST.stack(),LVMACHINEHULL.stack(),POLYETHYLENE.stack(144),LVINPUTBUS.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE);
        Recipe.assembler(CHEST.stack(),LVMACHINEHULL.stack(),POLYETHYLENE.stack(144),LVOUTPUTBUS.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE);
        Recipe.assembler(BCTANK.stack(),LVMACHINEHULL.stack(),POLYETHYLENE.stack(144),LVINPUTHATCH.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE);
        Recipe.crafting(TOOLSCREWDRIVER.stack(),TOOLWRENCH.stack(),TOOLWIRECUTTERS.stack(),TOOLHAMMER.stack(),TOOLCROWBAR.stack(),TOOLFILE.stack(),TOOLSAW.stack(),TOOLSOFTMALLET.stack(),LVMACHINEHULL.stack(),MAINTENANCEHATCH.stack());
        Recipe.crafting(LVMACHINEHULL.stack(),LVMOTOR.stack(),BRONZEFLUIDPIPE.stack(),BRONZEROTOR.stack(),LVMUFFLERHATCH.stack());
        Recipe.crafting(ELECTRONICCIRCUIT.stack(),TINCABLE1.stack(2),LUBRICANTCELL.stack(2),LVCOIL.stack(2),LVPUMP.stack(),LVMACHINEHULL.stack(), LVENERGYHATCH.stack());
        Recipe.assembler(CUPRONICKELWIRE2.stack(8),MICAINSULATORFOIL.stack(8),MOLTENTININGOT.stack(1),CUPRONICKELCOILBLOCK.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE);
    }
    //RCTanks
    public static void railcraftTanks(){
        //Walls
        Recipe.crafting(IRONPLATE.stack(4),IRONSCREW.stack(4),TOOLSCREWDRIVER.stack(),IRONTANKWALL.stack(2));
        Recipe.assembler(IRONPLATE.stack(2),IRONTANKWALL.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE).priority(100);
        Recipe.crafting(STEELPLATE.stack(4),STEELSCREW.stack(4),TOOLSCREWDRIVER.stack(),STEELTANKWALL.stack(2));
        Recipe.assembler(STEELPLATE.stack(2),STEELTANKWALL.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE).priority(100);
        //Valve
        Recipe.crafting(IRONBARS.stack(2),IRONSCREW.stack(4),LARGEBRONZEFLUIDPIPE.stack(2),TOOLSCREWDRIVER.stack(), IRONTANKVALVE.stack());
        Recipe.assembler(IRONBARS.stack(2),LARGEBRONZEFLUIDPIPE.stack(2),IRONTANKVALVE.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE).priority(100);
        Recipe.crafting(STEELBARS.stack(2),STEELSCREW.stack(4),LARGESTEELFLUIDPIPE.stack(2),TOOLSCREWDRIVER.stack(), STEELTANKVALVE.stack());
        Recipe.assembler(STEELBARS.stack(2),LARGESTEELFLUIDPIPE.stack(2),STEELTANKVALVE.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE).priority(100);

        //Gauge
        Recipe.crafting(IRONPLATE.stack(2),IRONSCREW.stack(4),GLASSPANE.stack(2),TOOLSCREWDRIVER.stack(),IRONTANKGAUGE.stack(2));
        Recipe.assembler(IRONPLATE.stack(),GLASSPANE.stack(),IRONTANKGAUGE.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE).priority(100);
        Recipe.crafting(STEELPLATE.stack(2),STEELSCREW.stack(4),GLASSPANE.stack(2),TOOLSCREWDRIVER.stack(),STEELTANKVALVE.stack(2));
        Recipe.assembler(STEELPLATE.stack(),GLASSPANE.stack(),STEELTANKVALVE.stack()).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE).priority(100);
    }


    //GT RECIPES
    static void misc(){
        Recipe.crafting(TOOLSAW.stack(),PLANK.stack(2),STICK.stack(4));
        Recipe.crafting(TOOLSAW.stack(),LOG.stack(),PLANK.stack(4));
        Recipe.crafting(LOG.stack(4),PLANK.stack(4),FLINT.stack(),CHEST.stack());
        Recipe.smeltery(GLASSDUST.stack(),GLASS.stack());
        Recipe.chemicalReactor(DUSTRAWRUBBER.stack(9),DUSTSULFUR.stack(),MOLTENRUBBERINGOT.stack(9));
        Recipe.crafting(GRAVEL.stack(3),FLINT.stack());
        Recipe.brickForming(CLAYBALL.stack(8),UNFIREDCLAYBRICK.stack(8));
        Recipe.furnace(UNFIREDCLAYBRICK.stack(),BRICK.stack());
        Recipe.crafting(BRICK.stack(8),BUCKETOFWATER.stack(),BRICKS.stack(2));
        //Note: This recipe actually requires two buckets (for whatever reason) However both buckets are returned. The extra bucket is ignored by this calculator to avoid confusion.
        Recipe.crafting(STONEDUST.stack(),CALCITEDUST.stack(2),QUARTZSAND.stack(),CLAYDUST.stack(),BUCKETOFWATER.stack(),BUCKETOFCONCRETE.stack());
        Recipe.crafting(BUCKETOFCONCRETE.stack(),GYPSUMDUST.stack(2),FIREBRICK.stack(6),FIREBRICKS.stack());
        Recipe.crafting(IRONFURNACE.stack(4),FIREBRICKS.stack(4),TOOLWRENCH.stack(),PRIMITIVEBLASTFURNACE.stack());
        Recipe.furnace(COMPRESSEDFIRECLAY.stack(),FIREBRICK.stack());
        Recipe.compressing(FIRECLAYDUST.stack(),COMPRESSEDFIRECLAY.stack());
        Recipe.crafting(TOOLSAW.stack(),GLASS.stack(),GLASSPANE.stack(2));
        Recipe.cuttingMachine(GLASS.stack(3),GLASSPANE.stack(8)).addRequiredStates(GTNHGameStates.CUTTINGMACHINE).priority(100);
        Recipe.crafting(IRONROD.stack(6),TOOLHAMMER.stack(),IRONBARS.stack(3));
        Recipe.crafting(IRONROD.stack(3),IRONBARS.stack(4)).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE).priority(100);
        Recipe.crafting(STEELROD.stack(6),TOOLHAMMER.stack(),STEELBARS.stack(3));
        Recipe.crafting(STEELROD.stack(3),STEELBARS.stack(4)).addRequiredStates(GTNHGameStates.ASSEMBLINGMACHINE).priority(100);
    }
    public static void init() {
        misc();
        canners();
        pumps();
        motors();
        wires();
        finewires();
        rotors();
        pipes();
        rings();
        screws();
        casings();
        hulls();
        glass();
        ingots();
        dusts();
        bolts();
        plates();
        rods();
        circuits();
        balls();
        plateCasings();
        gears();
        pistons();
        itemFilters();
        conveyors();
        foils();
        distilleries();
        electrolyzers();
        chemicalReactors();
        combustionGenerators();
        alloySmelters();
        furnaces();
        pumpBlocks();
        sifters();
        mixers();
        cuttingMachines();
        fluidExtractors();
        batteries();
        ebf();
        fluids();
        fluidHeaters();
        formingPresses();
        frameBoxes();
        polarizers();
        centrifuges();
        railcraftTanks();
    }
}
