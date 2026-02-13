import java.util.*;
import java.lang.*;

public class arr_horiz_patt{
    public static void main(String[] args){
        /*
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 3;
        arr[4] = 6;
        */

        int[] arr = {5, 7, 8, 3, 6};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}