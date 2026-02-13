import java.util.*;
import java.lang.*;

public class intro_to_arrays {
    public static void main(String[] args){
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 120;
        arr[2] = 50;

        System.out.println(arr[2]);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}