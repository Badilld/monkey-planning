public class worldState {
    /*
     * Monkey-Planning
     * worldState.java
     * Created By: Badilld
     * CSCI 402 - Program 2
     * Notes: This class maintains the worldstate, allowing for modification and
     * reference
     */
    private String roomMonkeyIn;
    private String roomBoxIn;
    private String roomBananasIn;
    private String monkeyHeight;
    private boolean monkeyHasBananas;

    public void setNewWorldState(char monkey, char box, char bananas){
        roomMonkeyIn = ""+monkey;
        roomBoxIn = ""+box;
        roomBananasIn = ""+bananas;
        monkeyHeight = "low";
        monkeyHasBananas = false;
    }

    public String getRoomMonkeyIn() {
        return this.roomMonkeyIn;
    }

    public String getRoomBoxIn() {
        return this.roomBoxIn;
    }

    public String getRoomBananasIn(){
        return this.roomBananasIn;
    }

    public String getMonkeyHeight(){
        return this.monkeyHeight;
    }

    public boolean monkeyHasBananas(){
        return this.monkeyHasBananas;
    }

    public void setRoomMonkeyIn(char letter){
        roomMonkeyIn = ""+letter;
    }
    
    public void setRoomBoxIn(char letter) {
        roomBoxIn = "" + letter;
    }
    
    public void setRoomBananasIn(char letter) {
        roomBananasIn = "" + letter;
    }

    public void setMonkeyHeight(char H){
        if (H == 'l') {
            monkeyHeight = "low";
        } else {
            monkeyHeight = "high";
        }
    }

    public void setHasBananas(boolean state){
        monkeyHasBananas = state;
    }

    public boolean isMonkeyAt(String location){
        if (location.equals(getRoomMonkeyIn())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMonkeyHeight(String height) {
        if (height.equals(getMonkeyHeight())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBoxAt(String location){
        if (location.equals(getRoomBoxIn())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBananasAt(String location){
        if (location.equals(getRoomBananasIn())){
            return true;
        } else {
            return false;
        }
    }
}
