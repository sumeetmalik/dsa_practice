import java.util.*;
import java.lang.*;

public class intro_to_functions {
    public static void main(String[] args){
        System.out.println("Hello");
        printLineSeparator(10);

        System.out.println("World");
        printLineSeparator(10);
    }

    public static void printLineSeparator(int n){
        for(int i = 1; i <= n; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}