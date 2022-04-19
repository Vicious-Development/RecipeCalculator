package items;

import recipe.Recipe;
import states.GTNHGameStates;
import states.impl.GameState;

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
    public static final Item CHEST = add(Item.solid("CHEST"));
    public static final Item CLAYBALL = add(Item.solid("CLAYBALL"));
    public static final Item BRICKS = add(Item.solid("BRICKS"));
    public static final Item BRICK = add(Item.solid("BRICK"));
    public static final Item FURNACE = add(Item.solid("FURNACE"));
    public static final Item COBBLESTONE = add(Item.solid("COBBLESTONE"));
    //Represents any form of a bucket of water. Use WATER for millibuckets
    public static final Item BUCKETOFWATER = add(Item.fluid("BUCKETOFWATER"));
    public static final Item WATER = add(Item.fluid("WATER"));
    //IC2
    public static final Item STICKYRESIN = add(Item.solid("STICKYRESIN"));
    public static final Item PLANTBALL = add(Item.solid("PLANTBALL"));
    //TiC
    public static final Item CLEARGLASS = add(Item.solid("CLEARGLASS"));
    static void glass(){
        Recipe.chisel(CLEARGLASS.stack(),GLASS.stack());
    }
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
    public static final Item REDALLOYINGOT = add(Item.solid("REDALLOYINGOT"));
    public static final Item BRONZEINGOT = add(Item.solid("BRONZEINGOT"));
    public static final Item WROUGHTIRONINGOT = add(Item.solid("WROUGHTIRONINGOT"));
    static void ingots(){
        Recipe.crafting(IRONINGOT.stack(),TOOLSAW.stack(),IRONNUGGET.stack(9));
        Recipe.furnace(IRONNUGGET.stack(),WROUGHTIRONNUGGET.stack());
        Recipe.compressing(WROUGHTIRONNUGGET.stack(9),WROUGHTIRONINGOT.stack());
        Recipe.alloySmelter(COPPERINGOT.stack(),REDSTONE.stack(4),REDALLOYINGOT.stack()).addRequiredStates(GTNHGameStates.ALLOYSMELTER);
        Recipe.alloySmelter(COPPERINGOT.stack(3),TININGOT.stack(),BRONZEINGOT.stack(4)).addRequiredStates(GTNHGameStates.ALLOYSMELTER).priority(100);
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

    //FLUIDS
    public static final Item BUCKETOFCONCRETE = add(Item.fluid("BUCKETOFCONCRETE"));
    public static final Item FLUIDCONCRETE = add(Item.fluid("CONCRETE"));
    public static final Item GLUE = add(Item.fluid("GLUE"));
    public static final Item MOLTENTIN = add(Item.fluid("TIN"));
    public static final Item MOLTENTININGOT = add(Item.fluid("TININGOT"));
    public static final Item MOLTENLEAD = add(Item.fluid("LEAD"));
    public static final Item MOLTENLEADINGOT = add(Item.fluid("LEADINGOT"));

    static void dusts(){
        //Wood pulp
        Recipe.crafting(LOG.stack(),TOOLMORTAR.stack(),WOODPULP.stack(2));
        Recipe.pulverize(LOG.stack(),WOODPULP.stack(8)).addRequiredStates(GTNHGameStates.MACERATOR).priority(Integer.MAX_VALUE);
        //Glass Dust
        Recipe.crafting(QUARTZSAND.stack(),TINYFLINTDUST.stack(),GLASSDUST.stack());
        Recipe.mixing(FLINTDUST.stack(),QUARTZSAND.stack(16),GLASSDUST.stack()).addRequiredStates(GTNHGameStates.MIXER).priority(Integer.MAX_VALUE);
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
        //Bronze ingot 2
        Recipe.crafting(TINDUST.stack(1),COPPERDUST.stack(3),BRONZEDUST.stack(3));
        Recipe.furnace(BRONZEDUST.stack(),BRONZEINGOT.stack());
    }
    //RODS
    public static final Item IRONROD = add(Item.solid("IRONROD"));
    public static final Item TINROD = add(Item.solid("TINROD"));
    public static final Item REDALLOYROD = add(Item.solid("REDALLOYROD"));
    public static final Item MAGNETICIRONROD = add(Item.solid("MAGNETICIRONROD"));
    public static final Item STEELROD = add(Item.solid("STEELROD"));
    static void rods(){
        Recipe.crafting(IRONINGOT.stack(),TOOLFILE.stack(),IRONROD.stack());
        Recipe.lathe(IRONINGOT.stack(),null,IRONROD.stack(),SMALLIRONDUST.stack(2)).priority(100).addRequiredStates(GTNHGameStates.LATHE);
        Recipe.crafting(TININGOT.stack(),TOOLFILE.stack(),TINROD.stack());
        Recipe.lathe(TININGOT.stack(),null,TINROD.stack(),SMALLTINDUST.stack(2)).priority(100).addRequiredStates(GTNHGameStates.LATHE);
        Recipe.crafting(REDALLOYINGOT.stack(),TOOLFILE.stack(),REDALLOYROD.stack());
        Recipe.lathe(REDALLOYINGOT.stack(),null,REDALLOYROD.stack(),SMALLREDALLOYDUST.stack(2)).priority(100).addRequiredStates(GTNHGameStates.LATHE);
        Recipe.crafting(STEELINGOT.stack(),TOOLFILE.stack(),STEELROD.stack());
        Recipe.lathe(STEELINGOT.stack(),null,STEELROD.stack(),SMALLSTEELDUST.stack(2)).priority(100).addRequiredStates(GTNHGameStates.LATHE);
        Recipe.crafting(IRONROD.stack(),REDSTONE.stack(4),MAGNETICIRONROD.stack());
        Recipe.polarize(IRONROD.stack(),MAGNETICIRONROD.stack()).addRequiredStates(GTNHGameStates.POLARIZER).priority(100);
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
    static void plates(){
        plate(WROUGHTIRONINGOT,WROUGHTIRONPLATE);
        plate(IRONINGOT,IRONPLATE);
        plate(COPPERINGOT,COPPERPLATE);
        plate(STEELINGOT,STEELPLATE);
        plate(TININGOT,TINPLATE);
        plate(BRONZEINGOT,BRONZEPLATE);
        plate(ZINCINGOT,ZINCPLATE);
        plate(REDALLOYINGOT,REDALLOYPLATE);
        Recipe.compressing(WOODPULP.stack(8),WOODPLANK.stack());
        Recipe.plateSolidification(MOLTENRUBBERINGOT.stack(),RUBBERSHEET.stack());
    }
    static void plate(Item ingot, Item plate){
        Recipe.plateBending(ingot.stack(),plate.stack()).priority(100).addRequiredStates(GTNHGameStates.BENDINGMACHINE);
        Recipe.forgeHammer(ingot.stack(3),plate.stack(2)).priority(50).addRequiredStates(GTNHGameStates.FORGEHAMMER);
        Recipe.crafting(ingot.stack(2),plate.stack(1));
    }
    //Foil
    public static final Item ZINCFOIL = add(Item.solid("ZINCFOIL"));
    public static final Item COPPERFOIL = add(Item.solid("COPPERFOIL"));
    static void foils(){
        foilBending(ZINCPLATE,ZINCFOIL);
        foilBending(COPPERPLATE,COPPERFOIL);
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
    public static final Item REDALLOYBOLT = add(Item.solid("REDALLOYBOLT"));
    static void bolts(){
        bolt(TINROD,TININGOT,TINBOLT);
        bolt(IRONROD,IRONINGOT,IRONBOLT);
        bolt(REDALLOYROD,REDALLOYINGOT,REDALLOYBOLT);
    }
    static void bolt(Item rod, Item ingot, Item bolt){
        Recipe.crafting(rod.stack(),TOOLSAW.stack(),bolt.stack(2));
        Recipe.cuttingMachine(rod.stack(),bolt.stack(4)).priority(50).addRequiredStates(GTNHGameStates.CUTTINGMACHINE);
        Recipe.extruding(ingot.stack(),bolt.stack(8)).priority(100).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV));
    }
    //SCREWS
    public static final Item TINSCREW = add(Item.solid("TINSCREW"));
    public static final Item IRONSCREW = add(Item.solid("IRONSCREW"));
    static void screws(){
        screw(TINBOLT,TINSCREW);
        screw(IRONBOLT,IRONSCREW);
    }
    static void screw(Item bolt, Item screw){
        Recipe.crafting(bolt.stack(2),TOOLFILE.stack(),screw.stack());
        Recipe.lathe(bolt.stack(1),screw.stack(1)).priority(100).addRequiredStates(GTNHGameStates.LATHE);
    }
    //RING
    public static final Item TINRING = add(Item.solid("TINRING"));
    public static final Item RUBBERRING = add(Item.solid("RUBBERRING"));
    static void rings(){
        ring(TINROD,TININGOT,TINRING);
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
    static void rotors(){
        rotor(TINSCREW,TINRING,TINPLATE,TINROTOR);
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
    public static final Item COPPERCABLE1 = add(Item.solid("COPPERCABLE1"));
    public static final Item TINWIRE1 = add(Item.solid("TINWIRE1"));
    public static final Item TINCABLE1 = add(Item.solid("TINCABLE1"));
    public static final Item REDALLOYWIRE1 = add(Item.solid("REDALLOYWIRE1"));
    public static final Item REDALLOYCABLE1 = add(Item.solid("REDALLOYCABLE1"));
    public static final Item GOLDWIRE1 = add(Item.solid("GOLDWIRE1"));
    public static final Item STEELWIRE1 = add(Item.solid("STEELWIRE1"));
    static void wires(){
        wire(COPPERINGOT,COPPERPLATE,COPPERWIRE1);
        Recipe.crafting(COPPERWIRE1.stack(2),COPPERWIRE2.stack());
        Recipe.crafting(COPPERWIRE1.stack(4),COPPERWIRE4.stack());
        Recipe.crafting(COPPERWIRE1.stack(),RUBBERSHEET.stack(),COPPERCABLE1.stack());
        wire(TININGOT,TINPLATE,TINWIRE1);
        Recipe.crafting(TINWIRE1.stack(),RUBBERSHEET.stack(),TINCABLE1.stack());
        wire(REDALLOYINGOT,REDALLOYPLATE,REDALLOYWIRE1);
        Recipe.crafting(REDALLOYWIRE1.stack(),RUBBERSHEET.stack(),REDALLOYCABLE1.stack());
        wire(STEELINGOT,STEELPLATE,STEELWIRE1);
        wire(GOLDINGOT,GOLDPLATE,GOLDWIRE1);
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
    //Gear
    public static final Item SMALLSTEELGEAR = add(Item.solid("SMALLSTEELGEAR"));
    public static final Item STEELGEAR = add(Item.solid("STEELGEAR"));
    static void gears(){
        Recipe.crafting(TOOLHAMMER.stack(),TOOLWIRECUTTERS.stack(),STEELROD.stack(2),STEELPLATE.stack(),SMALLSTEELGEAR.stack());
        Recipe.extruding(STEELINGOT.stack(),SMALLSTEELGEAR.stack()).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV)).priority(100);
        Recipe.crafting(STEELPLATE.stack(4),STEELINGOT.stack(4),STEELGEAR.stack());
        Recipe.alloySmelter(STEELINGOT.stack(8),STEELGEAR.stack()).addRequiredStates(GTNHGameStates.ALLOYSMELTER).priority(50);
        Recipe.extruding(STEELINGOT.stack(4),STEELGEAR.stack()).addRequiredStates(GTNHGameStates.EXTRUDER.withTier(GTNHGameStates.MV)).priority(100);
    }
    //Pipes
    public static final Item BRONZEFLUIDPIPE = add(Item.solid("BRONZEFLUIDPIPE"));
    public static final Item LARGEBRONZEFLUIDPIPE = add(Item.solid("LARGEBRONZEFLUIDPIPE"));
    public static final Item STEELFLUIDPIPE = add(Item.solid("STEELFLUIDPIPE"));
    public static final Item SMALLSTEELFLUIDPIPE = add(Item.solid("SMALLSTEELFLUIDPIPE"));
    public static final Item TINYTINITEMPIPE = add(Item.solid("TINYTINITEMPIPE"));
    //TODO:Add MV Extruding pipe recipes.
    static void pipes(){
        pipe(BRONZEPLATE,BRONZEFLUIDPIPE);
        pipe(STEELPLATE,STEELFLUIDPIPE);
        Recipe.crafting(TINPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),TINYTINITEMPIPE.stack(8));
        Recipe.crafting(BRONZEPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),LARGEBRONZEFLUIDPIPE.stack());
        Recipe.crafting(STEELPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),SMALLSTEELFLUIDPIPE.stack(6));
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
        Recipe.crafting(COALDUST.stack(),COPPERWIRE1.stack(1),FINECOPPERWIRE.stack(2),STICKYRESIN.stack(2),RESISTOR.stack());
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
    //Fluid Canner
    public static final Item LVFLUIDCANNER = add(Item.solid("LVFLUIDCANNER"));
    static void canner(){
        Recipe.crafting(GLASS.stack(4),TINCABLE1.stack(2),LVPUMP.stack(),LVMACHINEHULL.stack(),ELECTRONICCIRCUIT.stack(),null, LVFLUIDCANNER.stack());
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
    }
    public static void init() {
        misc();
        canner();
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
    }
}
