import java.util.*;
import java.lang.*;

// if divisible by 3 only -> print foo
// if divisible by 5 only -> print bar
// if divisiable by both -> print foobar
// if divisibl;e by none -> print the number
public class foobar {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int i = Integer.parseInt(scn.nextLine(), 10);
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