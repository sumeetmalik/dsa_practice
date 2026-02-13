import java.util.*;
import java.lang.*;

public class arr_vert_patt{
    public static void main(String[] args){
        int[] towers = {5, 2, 6, 1, 4};

        int ht = getMax(towers);

        for(int floor = ht; floor >= 1; floor--){
            for(int i = 0; i < towers.length; i++){
                if(towers[i] >= floor){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static int getMax(int[] arr){
        int val = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > val){
                val = arr[i];
            }
        }

        return val;
    }
}