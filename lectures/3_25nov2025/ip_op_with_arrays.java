import java.util.*;
import java.lang.*;

public class ip_op_with_arrays {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("How big an array do you want");
        int n = Integer.parseInt(scn.nextLine());

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Give me the " + i + "th value: ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        printArray(arr);
    }

    // arr = {10, 50, 3, 90, 2};
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
    }
}