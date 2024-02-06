import java.util.LinkedList;

/*
 * Monkey-Planning
 * planner.java
 * Created By: Badilld
 * CSCI 402 - Program 2
 * Notes: This function creates a plan to get the monkey to the bananas
 * 
 */

public class planner {
    /*
    * createPlan()
    * Function utilizes backwards chaining and objective priority to determine 
    * a series of preconditions for completion of the objective.
    */
    public static void createPlan() {
        LinkedList<String> plan = new LinkedList<String>();
        // Get our Input
        char room = display.getRoom();
        char box = display.getBox();
        char bananas = display.getBananas();
        // Create World and load input
        worldState world = new worldState();
        world.setNewWorldState(room, box, bananas);
        // Begin Planning
        while (true) {
            //Goal State, if true we are done
            if (world.monkeyHasBananas()) {
                break;
            }
            //Can we grab the bananas?
            if (grab.checkPreconditions(world)) {
                world = grab.applyPostconditions(world);
                plan.addLast("Grab ()");
            //Can we climb up to get the bananas?
            } else if (climbUp.checkPreconditions(world) && (world.isBananasAt(world.getRoomMonkeyIn()))) {
                world = climbUp.applyPostconditions(world);
                plan.addLast("Climb Up ()");
            //Can we push a box to the bananas?
            } else if (push.checkPreconditions(world, world.getRoomMonkeyIn(), world.getRoomBananasIn())) {
                plan.addLast("Push (" + world.getRoomMonkeyIn() + "," + world.getRoomBananasIn() + ")");
                world = push.applyPostconditions(world);
            //Can we get a box?
            } else if (move.checkPreconditions(world, world.getRoomMonkeyIn(), world.getRoomBoxIn())) {
                plan.addLast("Move (" + world.getRoomMonkeyIn() + "," + world.getRoomBoxIn() + ")");
                world = move.applyPostconditions(world);
            }
            //Can we get down from a box? - Note: That we will never need to do this because of the heuristic design
            else if (climbDown.checkPreconditions(world)){
                plan.add("Climb Down ()");
                world = climbDown.applyPostconditions(world);
            }

        }
        //Print out the plan
        display.printPlan(plan);
    }
}
