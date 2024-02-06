public class climbUp {
    /*
     * Monkey-Planning
     * climbUp.java
     * Created By: Badilld
     * CSCI 402 - Program 2
     * Notes: This class represents the monkey climbing upwards onto a box
     * 
     */
    private static String monkeyLocation;

    //checkPreconditions()
    //Is the box in the same room as the monkey? Is the monkey already on the box?
    //Climb up if first is true and second is false
    public static boolean checkPreconditions(worldState world) {
        monkeyLocation = world.getRoomMonkeyIn();
        if (!world.isBoxAt(monkeyLocation)) {
            return false;
        }

        if (!world.isMonkeyHeight("low")) {
            return false;
        }

        return true;
    }

    //applyPostconditions()
    //monkey is now up high (on top of box)
    public static worldState applyPostconditions(worldState world) {
        world.setMonkeyHeight('h');
        return world;
    }
}
