import java.util.*;
import java.lang.*;

public class loops {
    public static void main(String[] args){
        System.out.println("Give me a number");

        Scanner scn = new Scanner(System.in);
        int num = Integer.parseInt(scn.nextLine(), 10);

        for(int i = 1; i <= num; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("foobar");
            } else if(i % 3 == 0){
                System.out.println("foo");
            } else if(i % 5 == 0){
                System.out.println("bar");
            } else {
                System.out.println(i);
            }
        }
    }
}