import java.util.*;
import java.lang.*;

public class conditionals{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Give me a number:");
        int i = Integer.parseInt(scn.nextLine(), 10);

        int rem = i % 2;

        if(rem == 0){
            System.out.println("The number you entered " + i + " is even");
        } else {
            System.out.println("The number you entered " + i + " is odd");
        }
    }
}