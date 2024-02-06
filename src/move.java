public class move {
    /*
     * Monkey-Planning
     * move.java
     * Created By: Badilld
     * CSCI 402 - Program 2
     * Notes: This class represents the monkey moving around the environment
     * 
     */
    private static String moveFrom;
    private static String moveTo;

    //checkPreconditions()
    //Is the monkey already here or on a box? Return false. Otherwise return true
    public static boolean checkPreconditions(worldState world, String from, String to){
        moveFrom = from;
        moveTo = to;
        if (!world.isMonkeyAt(moveFrom)){
            return false;
        }

        if (!world.isMonkeyHeight("low")){
            return false;
        }

        return true;
    }
    
    //applyPostconditions()
    //Monkey has moved to the given room
    public static worldState applyPostconditions(worldState world) {
        world.setRoomMonkeyIn(moveTo.charAt(0));
        return world;
    }
}
