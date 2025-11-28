import java.util.*;
import java.lang.*;

public class linear_search {
    public static void main(String[] args){
        int[] arr = {20, 50, 70, 2, 99, 33, 64};
        printArray(arr);

        Scanner scn = new Scanner(System.in);
        System.out.println("Give me an element to search");

        int el = Integer.parseInt(scn.nextLine());
        int idx = search(arr, el);

        System.out.println("Found at:" + idx);
    }

    /*
    static int search(int[] arr, int el){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == el){
                return i;
            }
        }

        return -1;
    }*/

   static int search(int[] arr, int el){
        int idx = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == el){
                idx = i;
                break;
            }
        }

        return idx;
   }


    static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val + ", ");
        }

        System.out.println(".");
    }
}