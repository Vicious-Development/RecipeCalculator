public class GTNH {
    //Vanilla
    public static final Item STICK = Item.solid("STICK");
    public static final Item PLANK = Item.solid("PLANK");
    public static final Item LOG = Item.solid("LOG");
    public static final Item GLASS = Item.solid("GLASS");
    public static final Item SAND = Item.solid("SAND");
    public static final Item GRAVEL = Item.solid("GRAVEL");
    public static final Item FLINT = Item.solid("FLINT");
    public static final Item REDSTONE = Item.solid("REDSTONE");
    public static final Item COAL = Item.solid("COAL");
    public static final Item CHEST = Item.solid("CHEST");
    //IC2
    public static final Item STICKYRESIN = Item.solid("STICKYRESIN");
    //TiC
    public static final Item CLEARGLASS = Item.solid("CLEARGLASS");
    static void glass(){
        Recipe.chisel(CLEARGLASS.stack(),GLASS.stack());
    }
    //GT
    //FLUIDS
    public static final Item MOLTENRUBBERINGOT = Item.fluid("RUBBERINGOT");
    //Tools
    public static final Item TOOLSAW = Item.solid("TOOLSAW");
    public static final Item TOOLHAMMER = Item.solid("TOOLHAMMER");
    public static final Item TOOLWIRECUTTERS = Item.solid("TOOLWIRECUTTERS");
    public static final Item TOOLFILE = Item.solid("TOOLFILE");
    public static final Item TOOLWRENCH = Item.solid("TOOLWRENCH");
    public static final Item TOOLSCREWDRIVER = Item.solid("TOOLSCREWDRIVER");
    public static final Item TOOLKNIFE = Item.solid("TOOLKNIFE");
    //NUGGETS
    public static final Item IRONNUGGET = Item.solid("IRONNUGGET");
    public static final Item WROUGHTIRONNUGGET = Item.solid("WROUGHTIRONNUGGET");
    //INGOTS
    public static final Item TININGOT = Item.solid("TININGOT");
    public static final Item IRONINGOT = Item.solid("IRONINGOT");
    public static final Item ZINCINGOT = Item.solid("ZINCINGOT");
    public static final Item COPPERINGOT = Item.solid("COPPERINGOT");
    public static final Item STEELINGOT = Item.solid("STEELINGOT");
    public static final Item GOLDINGOT = Item.solid("GOLDINGOT");
    public static final Item SILVERINGOT = Item.solid("SILVERINGOT");
    public static final Item REDALLOYINGOT = Item.solid("REDALLOYINGOT");
    public static final Item BRONZEINGOT = Item.solid("BRONZEINGOT");
    public static final Item WROUGHTIRONINGOT = Item.solid("WROUGHTIRONINGOT");
    static void ingots(){
        Recipe.crafting(IRONINGOT.stack(),TOOLSAW.stack(),null,IRONNUGGET.stack(9));
        Recipe.furnace(IRONNUGGET.stack(),null,WROUGHTIRONNUGGET.stack());
        Recipe.compacting(WROUGHTIRONNUGGET.stack(9),null,WROUGHTIRONINGOT.stack());
        Recipe.alloySmelter(COPPERINGOT.stack(),REDSTONE.stack(4),null,REDALLOYINGOT.stack());
        Recipe.alloySmelter(COPPERINGOT.stack(3),TININGOT.stack(),null,BRONZEINGOT.stack(4));
    }

    //DUST TINY
    public static final Item TINYFLINTDUST = Item.solid("TINYFLINTDUST");
    //DUST SMALL
    public static final Item SMALLIRONDUST = Item.solid("SMALLIRONDUST");
    public static final Item SMALLTINDUST = Item.solid("SMALLTINDUST");
    public static final Item SMALLSTEELDUST = Item.solid("SMALLSTEELDUST");
    public static final Item SMALLREDALLOYDUST = Item.solid("SMALLREDALLOYDUST");
    //DUST NORMAL
    public static final Item FLINTDUST = Item.solid("FLINTDUST");
    public static final Item DUSTRAWRUBBER = Item.solid("DUSTRAWRUBBER");
    public static final Item DUSTSULFUR = Item.solid("DUSTSULFUR");
    public static final Item QUARTZSAND = Item.solid("QUARTZSAND");
    public static final Item GLASSDUST = Item.solid("GLASSDUST");
    public static final Item WOODPULP = Item.solid("WOODPULP");
    public static final Item COALDUST = Item.solid("COALDUST");

    static void dusts(){
        Recipe.crafting(QUARTZSAND.stack(),TINYFLINTDUST.stack(),null,GLASSDUST.stack());
        Recipe.crafting(SAND.stack(),TOOLHAMMER.stack(),null,QUARTZSAND.stack());
        Recipe.pulverize(FLINT.stack(2),null,FLINTDUST.stack());
        Recipe.crafting(FLINTDUST.stack(),null,TINYFLINTDUST.stack(9));
        Recipe.extracting(STICKYRESIN.stack(),DUSTRAWRUBBER.stack(3));
        Recipe.pulverize(LOG.stack(),WOODPULP.stack(8));
        Recipe.pulverize(COAL.stack(),COALDUST.stack(1));
    }
    //RODS
    public static final Item IRONROD = Item.solid("IRONROD");
    public static final Item TINROD = Item.solid("TINROD");
    public static final Item REDALLOYROD = Item.solid("REDALLOYROD");
    public static final Item MAGNETICIRONROD = Item.solid("MAGNETICIRONROD");
    public static final Item STEELROD = Item.solid("STEELROD");
    static void rods(){
        Recipe.lathe(IRONINGOT.stack(),null,IRONROD.stack(),SMALLIRONDUST.stack(2));
        Recipe.lathe(TININGOT.stack(),null,TINROD.stack(),SMALLTINDUST.stack(2));
        Recipe.lathe(REDALLOYINGOT.stack(),null,REDALLOYROD.stack(),SMALLREDALLOYDUST.stack(2));
        Recipe.lathe(STEELINGOT.stack(),null,STEELROD.stack(),SMALLSTEELDUST.stack(2));
        Recipe.crafting(IRONROD.stack(),REDSTONE.stack(4),MAGNETICIRONROD.stack());
    }
    //Balls
    public static final Item GLASSTUBE = Item.solid("GLASSTUBE");
    static void balls(){
        Recipe.alloySmelter(GLASSDUST.stack(),GLASSTUBE.stack());
    }
    //Plates
    public static final Item IRONPLATE = Item.solid("IRONPLATE");
    public static final Item COPPERPLATE = Item.solid("COPPERPLATE");
    public static final Item TINPLATE = Item.solid("TINPLATE");
    public static final Item STEELPLATE = Item.solid("STEELPLATE");
    public static final Item WROUGHTIRONPLATE = Item.solid("WROUGHTIRONPLATE");
    public static final Item GOLDPLATE = Item.solid("GOLDPLATE");
    public static final Item ZINCPLATE = Item.solid("ZINCPLATE");
    public static final Item BRONZEPLATE = Item.solid("BRONZEPLATE");
    public static final Item RUBBERSHEET = Item.solid("RUBBERSHEET");
    public static final Item WOODPLANK = Item.solid("WOODPLANK");
    static void plates(){
        plate(WROUGHTIRONINGOT,WROUGHTIRONPLATE);
        plate(IRONINGOT,IRONPLATE);
        plate(COPPERINGOT,COPPERPLATE);
        plate(STEELINGOT,STEELPLATE);
        plate(TININGOT,TINPLATE);
        plate(BRONZEINGOT,BRONZEPLATE);
        plate(ZINCINGOT,ZINCPLATE);
        Recipe.compacting(WOODPULP.stack(8),WOODPLANK.stack());
        Recipe.plateSolidification(MOLTENRUBBERINGOT.stack(),RUBBERSHEET.stack());
    }
    static void plate(Item ingot, Item plate){
        Recipe.plateBending(ingot.stack(),null,plate.stack());
    }
    //Foil
    public static final Item ZINCFOIL = Item.solid("ZINCFOIL");
    static void foils(){
        Recipe.plateBending(ZINCPLATE.stack(),ZINCFOIL.stack(4));
    }
    //CASING
    public static final Item STEELCASING = Item.solid("STEELCASING");
    static void plateCasings(){
        Recipe.alloySmelter(STEELINGOT.stack(2),STEELCASING.stack(3));
    }
    //BOLTS
    public static final Item TINBOLT = Item.solid("TINBOLT");
    public static final Item IRONBOLT = Item.solid("IRONBOLT");
    public static final Item REDALLOYBOLT = Item.solid("REDALLOYBOLT");
    static void bolts(){
        bolt(TINROD,TINBOLT);
        bolt(IRONROD,IRONBOLT);
        bolt(REDALLOYROD,REDALLOYBOLT);
    }
    static void bolt(Item rod, Item bolt){
        Recipe.crafting(rod.stack(),TOOLSAW.stack(),null,bolt.stack(2));
    }
    //SCREWS
    public static final Item TINSCREW = Item.solid("TINSCREW");
    public static final Item IRONSCREW = Item.solid("IRONSCREW");
    static void screws(){
        screw(TINBOLT,TINSCREW);
        screw(IRONBOLT,IRONSCREW);
    }
    static void screw(Item bolt, Item screw){
        Recipe.crafting(bolt.stack(2),TOOLFILE.stack(),null,screw.stack(2));
    }
    //RING
    public static final Item TINRING = Item.solid("TINRING");
    public static final Item RUBBERRING = Item.solid("RUBBERRING");
    static void rings(){
        ring(TINROD,TINRING);
        softRing(RUBBERSHEET,RUBBERRING);
    }
    static void ring(Item rod, Item ring){
        Recipe.crafting(TOOLHAMMER.stack(),TOOLFILE.stack(),rod.stack(),null,ring.stack());
    }
    static void softRing(Item plate, Item ring){
        Recipe.crafting(TOOLKNIFE.stack(),plate.stack(),null,ring.stack());
    }

    //ROTOR
    public static final Item TINROTOR = Item.solid("TINROTOR");
    static void rotors(){
        rotor(TINSCREW,TINRING,TINPLATE,TINROTOR);
    }
    static void rotor(Item screw, Item ring, Item plate, Item rotor){
        Recipe.crafting(plate.stack(4),screw.stack(),ring.stack(),TOOLHAMMER.stack(),TOOLFILE.stack(),TOOLSCREWDRIVER.stack(),null,rotor.stack());
    }
    //Wires
    public static final Item COPPERWIRE1 = Item.solid("COPPERWIRE1");
    public static final Item COPPERCABLE1 = Item.solid("COPPERCABLE1");
    public static final Item TINWIRE1 = Item.solid("TINWIRE1");
    public static final Item TINCABLE1 = Item.solid("TINCABLE1");
    public static final Item REDALLOYWIRE1 = Item.solid("REDALLOYWIRE1");
    public static final Item REDALLOYCABLE1 = Item.solid("REDALLOYCABLE1");
    public static final Item GOLDWIRE1 = Item.solid("GOLDWIRE1");
    public static final Item STEELWIRE1 = Item.solid("STEELWIRE1");
    static void wires(){
        Recipe.wiremill(COPPERINGOT.stack(),COPPERWIRE1.stack(2));
        Recipe.crafting(COPPERWIRE1.stack(),RUBBERSHEET.stack(),COPPERCABLE1.stack());
        Recipe.wiremill(TININGOT.stack(),TINWIRE1.stack(2));
        Recipe.crafting(TINWIRE1.stack(),RUBBERSHEET.stack(),TINCABLE1.stack());
        Recipe.wiremill(REDALLOYINGOT.stack(),REDALLOYWIRE1.stack(2));
        Recipe.crafting(REDALLOYWIRE1.stack(),RUBBERSHEET.stack(),REDALLOYCABLE1.stack());
        Recipe.wiremill(STEELINGOT.stack(),STEELWIRE1.stack(2));

        Recipe.wiremill(GOLDINGOT.stack(),GOLDWIRE1.stack(2));
    }
    //Fine Wire
    public static final Item FINESTEELWIRE = Item.solid("FINESTEELWIRE");
    public static final Item FINECOPPERWIRE = Item.solid("FINECOPPERWIRE");
    static void finewires(){
        Recipe.wiremill(COPPERWIRE1.stack(), FINECOPPERWIRE.stack(4));
        Recipe.wiremill(STEELWIRE1.stack(), FINESTEELWIRE.stack(4));
    }
    //Gear
    public static final Item SMALLSTEELGEAR = Item.solid("SMALLSTEELGEAR");
    public static final Item STEELGEAR = Item.solid("STEELGEAR");
    static void gears(){
        Recipe.crafting(TOOLHAMMER.stack(),TOOLWIRECUTTERS.stack(),STEELROD.stack(2),STEELPLATE.stack(),SMALLSTEELGEAR.stack());
        Recipe.alloySmelter(STEELINGOT.stack(8),STEELGEAR.stack());
    }
    //Pipes
    public static final Item BRONZEFLUIDPIPE = Item.solid("BRONZEFLUIDPIPE");
    public static final Item STEELFLUIDPIPE = Item.solid("STEELFLUIDPIPE");
    public static final Item TINYTINITEMPIPE = Item.solid("TINYTINITEMPIPE");
    static void pipes(){
        pipe(BRONZEPLATE,BRONZEFLUIDPIPE);
        pipe(STEELPLATE,STEELFLUIDPIPE);
        Recipe.crafting(TINPLATE.stack(6),TOOLHAMMER.stack(),TOOLWRENCH.stack(),TINYTINITEMPIPE.stack(8));
    }
    static void pipe(Item plate, Item pipe){
        Recipe.crafting(plate.stack(6),TOOLWRENCH.stack(),TOOLHAMMER.stack(),null,pipe.stack(2));
    }
    //CIRCUITBOARDS
    public static final Item LVCIRCUITBOARD = Item.solid("LVCIRCUITBOARD");
    public static final Item COATEDCIRCUITBOARD = Item.solid("COATEDCIRCUITBOARD");
    //CIRCUITS
    public static final Item ELECTRONICCIRCUIT = Item.solid("ELECTRONICCIRCUIT");
    public static final Item VACUUMTUBE = Item.solid("VACUUMTUBE");
    public static final Item RESISTOR = Item.solid("RESISTOR");
    static void circuits(){
        Recipe.crafting(WOODPLANK.stack(),STICKYRESIN.stack(2),COATEDCIRCUITBOARD.stack());
        Recipe.crafting(COPPERWIRE1.stack(8),COATEDCIRCUITBOARD.stack(),LVCIRCUITBOARD.stack());
        Recipe.crafting(REDALLOYBOLT.stack(),COPPERWIRE1.stack(2),FINECOPPERWIRE.stack(3),STEELROD.stack(2),GLASSTUBE.stack(),VACUUMTUBE.stack());
        Recipe.crafting(COALDUST.stack(),COPPERWIRE1.stack(1),FINECOPPERWIRE.stack(2),STICKYRESIN.stack(2),RESISTOR.stack());
        Recipe.crafting(REDALLOYWIRE1.stack(3),VACUUMTUBE.stack(2),LVCIRCUITBOARD.stack(),RESISTOR.stack(2),STEELCASING.stack(),ELECTRONICCIRCUIT.stack());
    }
    //CASING
    public static final Item LVMACHINECASING = Item.solid("LVMACHINECASING");
    static void casings(){
        casing(STEELPLATE,LVMACHINECASING);
    }
    static void casing(Item plate, Item casing){
        Recipe.crafting(plate.stack(8),TOOLWRENCH.stack(),null,casing.stack());
    }
    //MACHINE HULLS
    public static final Item LVMACHINEHULL = Item.solid("LVMACHINEHULL");
    static void hulls(){
        hull(LVMACHINECASING,STEELPLATE,WROUGHTIRONPLATE,TINCABLE1,LVMACHINEHULL);
    }
    static void hull(Item casing, Item plate1, Item plate2, Item cable, Item hull){
        Recipe.crafting(plate1.stack(),plate2.stack(2),cable.stack(2),casing.stack(),null,hull.stack());
    }
    //MOTORS
    public static final Item LVMOTOR = Item.solid("LVMOTOR");
    static void motors(){
        motorNotLuV(COPPERWIRE1,TINCABLE1,MAGNETICIRONROD,IRONROD,LVMOTOR);
    }
    static void motorNotLuV(Item wire, Item cable, Item magnetRod, Item rod, Item motor){
        Recipe.crafting(cable.stack(2),wire.stack(4),magnetRod.stack(),rod.stack(2),null,motor.stack());
    }
    //Conveyors
    public static final Item LVCONVEYOR = Item.solid("LVCONVEYOR");
    static void conveyors(){
        Recipe.crafting(RUBBERSHEET.stack(6),LVMOTOR.stack(2),TINCABLE1.stack(),LVCONVEYOR.stack());
    }
    //PISTONS
    public static final Item LVPISTON = Item.solid("LVPISTON");
    static void pistons(){
        piston(STEELROD,SMALLSTEELGEAR,STEELPLATE,LVMOTOR,TINCABLE1,LVPISTON);
    }
    static void piston(Item rod, Item smallGear, Item plate, Item motor, Item cable, Item piston){
        Recipe.crafting(rod.stack(2),smallGear.stack(),plate.stack(3),cable.stack(2),motor.stack(),piston.stack());
    }
    //PUMP
    public static final Item LVPUMP = Item.solid("LVPUMP");
    static void pumps(){
        pumpLessIV(TINROTOR,TINSCREW,TINCABLE1,LVMOTOR,BRONZEFLUIDPIPE,LVPUMP);
    }
    static void pumpLessIV(Item rotor, Item screw, Item cable, Item motor, Item pipe, Item pump){
        Recipe.crafting(screw.stack(),rotor.stack(),cable.stack(),RUBBERRING.stack(2),pipe.stack(),motor.stack(),TOOLSCREWDRIVER.stack(),TOOLWRENCH.stack(),pump.stack());
    }
    //Item Filters
    public static final Item ITEMFILTER = Item.solid("ITEMFILTER");
    public static final Item LVITEMFILTER = Item.solid("LVITEMFILTER");
    static void itemFilters(){
        Recipe.assembler(FINESTEELWIRE.stack(64),ZINCFOIL.stack(16),ITEMFILTER.stack());
        Recipe.crafting(CHEST.stack(),ELECTRONICCIRCUIT.stack(),LVCONVEYOR.stack(),LVMACHINEHULL.stack(),ITEMFILTER.stack(),LVITEMFILTER.stack());
    }
    //Fluid Canner
    public static final Item LVFLUIDCANNER = Item.solid("LVFLUIDCANNER");
    static void canner(){
        Recipe.crafting(GLASS.stack(4),TINCABLE1.stack(2),LVPUMP.stack(),LVMACHINEHULL.stack(),ELECTRONICCIRCUIT.stack(),null, LVFLUIDCANNER.stack());
    }
    //Distillery
    public static final Item LVDISTILLERY = Item.solid("LVDISTILLERY");
    static void distilleries(){
        Recipe.crafting(ELECTRONICCIRCUIT.stack(2),BRONZEFLUIDPIPE.stack(),GLASS.stack(2),LVPUMP.stack(),TINCABLE1.stack(2),LVMACHINEHULL.stack(),LVDISTILLERY.stack());
    }
    //Electrolyzer
    public static final Item LVELECTROLYZER = Item.solid("LVELECTROLYZER");
    static void electrolyzers(){
        Recipe.crafting(GOLDWIRE1.stack(4),GLASS.stack(),ELECTRONICCIRCUIT.stack(2),TINCABLE1.stack(),LVMACHINEHULL.stack(),LVELECTROLYZER.stack());
    }
    //Chemical Reactor
    public static final Item LVCHEMICALREACTOR = Item.solid("LVCHEMICALREACTOR");
    static void chemicalReactors(){
        Recipe.crafting(ELECTRONICCIRCUIT.stack(2),TINROTOR.stack(),LVMOTOR.stack(),TINCABLE1.stack(2),GLASS.stack(2),LVMACHINEHULL.stack(),LVCHEMICALREACTOR.stack());
    }
    //Combustion Generators
    public static final Item LVCOMBUSTIONGENERATOR = Item.solid("LVCHEMICALREACTOR");
    static void combustionGenerators(){
        Recipe.crafting(LVPISTON.stack(2),LVMOTOR.stack(2),ELECTRONICCIRCUIT.stack(),LVMACHINEHULL.stack(),TINCABLE1.stack(),STEELGEAR.stack(2),LVCOMBUSTIONGENERATOR.stack());
    }
    //GT RECIPES
    static void misc(){
        Recipe.crafting(TOOLSAW.stack(),PLANK.stack(2),null,STICK.stack(4));
        Recipe.crafting(TOOLSAW.stack(),LOG.stack(),null,PLANK.stack(4));
        Recipe.crafting(LOG.stack(4),PLANK.stack(4),FLINT.stack(),CHEST.stack());
        Recipe.smeltery(GLASSDUST.stack(),null,GLASS.stack());
        Recipe.chemicalReactor(DUSTRAWRUBBER.stack(9),DUSTSULFUR.stack(),MOLTENRUBBERINGOT.stack(9));
        Recipe.crafting(GRAVEL.stack(3),FLINT.stack());
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
    }
}
