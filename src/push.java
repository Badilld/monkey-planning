public class push {
    /*
     * Monkey-Planning
     * push.java
     * Created By: Badilld
     * CSCI 402 - Program 2
     * Notes: This class represents the monkey pushing the box
     * 
     */
    private static String pushFrom;
    private static String pushTo;

    //checkPreconditions()
    //Is the monkey in the room, is the box in the room, and is the monkey not on the box?
    //If so, return true. Otherwise return false
    public static boolean checkPreconditions(worldState world, String from, String to) {
        pushFrom = from;
        pushTo = to;
        if (!world.isMonkeyAt(pushFrom)) {
            return false;
        }

        if (!world.isBoxAt(pushFrom)){
            return false;
        }

        if (!world.isMonkeyHeight("low")) {
            return false;
        }

        return true;
    }

    //applyPostconditions()
    // Monkey has moved to the given room and box has moved to the given room
    public static worldState applyPostconditions(worldState world) {
        world.setRoomBoxIn(pushTo.charAt(0));
        world.setRoomMonkeyIn(pushTo.charAt(0));
        return world;
    }
}
