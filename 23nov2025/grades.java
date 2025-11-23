import java.util.*;
import java.lang.*;


// 90-100, A
// 80-89, B
// 70-79, C
// 60-69, D
// 50-59, E
// 0-49, F
public class grades {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("How many did you score?");
        int i = Integer.parseInt(scn.nextLine(), 10);

        if(i >= 90){
            System.out.println("A");
        } else if(i >= 80){
            System.out.println("B");
        } else if(i >= 70){
            System.out.println("C");
        } else if(i >= 60){
            System.out.println("D");
        } else if(i >= 50){
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}