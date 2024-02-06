public class grab {
    /*
     * Monkey-Planning
     * grab.java
     * Created By: Badilld
     * CSCI 402 - Program 2
     * Notes: This class represents the monkey grabbing the bananas
     * 
     */
    private static String monkeyLocation;

    // checkPreconditions()
    // Is the monkey high? Is the monkey in the same room as the bananas?
    // CIf both are true, grab bananas
    public static boolean checkPreconditions(worldState world) {
        monkeyLocation = world.getRoomMonkeyIn();
        if (!world.isBananasAt(monkeyLocation)) {
            return false;
        }

        if (!world.isMonkeyHeight("high")) {
            return false;
        }

        return true;
    }

    //applyPostconditions()
    //Monkey has bananas!
    public static worldState applyPostconditions(worldState world) {
        world.setHasBananas(true);;
        return world;
    }
}
