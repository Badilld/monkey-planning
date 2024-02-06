import java.util.LinkedList;
import java.util.Scanner;

public class display {
    /*
     * Monkey-Planning
     * display.java
     * Created By: Badilld
     * CSCI 402 - Program 2
     * Notes: This class handles all printing to terminal and gets input from humans
     * 
     */

    private static char getChar(){
        char c;
        Scanner in = new Scanner(System.in);
        c = in.next().charAt(0);
        if (c == 'A' || c == 'B' || c == 'C' || c == 'c' || c == 'b' || c == 'a'){
            //This space intentionally left blank
        }
        else {
            System.out.println("Invalid Input. Please enter A, B, or C");
            System.out.print("==>");
            c = getChar();
        }
        return c;
    }

    public static char getRoom(){
        System.out.println("=================================================\n");
        System.out.println("Select which room the monkey starts in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.print("==>");
        return getChar();
    }

    public static char getBox() {
        System.out.println("Select which room the box starts in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.print("==>");
        return getChar();
    }

    public static char getBananas() {
        System.out.println("Select which room the bananas starts in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.print("==>");
        return getChar();
    }

    //NEEDS TESTING
    public static void printPlan(LinkedList<String> plan){
        System.out.println("Plan:");
        //Print steps in order
        while (plan.peek() != null){
            System.out.println(plan.pop());
        }
        System.out.println("=================================================");
    }


}
