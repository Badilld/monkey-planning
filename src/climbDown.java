public class climbDown {
    /*
     * Monkey-Planning
     * climbDown.java
     * Created By: Badilld
     * CSCI 402 - Program 2
     * Notes: This class represents the monkey climbing downwards from a box
     * 
     */
    private static String monkeyLocation;

    // checkPreconditions()
    // Is the box in the same room as the monkey? Is the monkey already on the box?
    // Climb down if both are true
    public static boolean checkPreconditions(worldState world) {
        monkeyLocation = world.getRoomMonkeyIn();
        if (!world.isBoxAt(monkeyLocation)) {
            return false;
        }

        if (!world.isMonkeyHeight("high")) {
            return false;
        }

        return true;
    }

    // applyPostconditions()
    // Monkey is now low
    public static worldState applyPostconditions(worldState world) {
        world.setMonkeyHeight('l');
        return world;
    }
}
