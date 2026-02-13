import java.util.*;
import java.lang.*;

public class binary_search {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number to search");

        int data = Integer.parseInt(scn.nextLine());

        int lo = 0;
        int hi = arr.length - 1;
        int idx = -1;

        while(lo <= hi){
            // int mid = (lo + hi) / 2;
            int mid = lo + (hi - lo) / 2;

            if(data < arr[mid]){
                hi = mid - 1;
            } else if(data > arr[mid]){
                lo = mid + 1;
            } else { // equal
                idx = mid;
                break;
            }
        }

        System.out.println("Found at: " + idx);
    }
}