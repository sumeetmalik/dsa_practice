import java.lang.*;
import java.util.*;

public class transpose {
    public static void main(String[] args){
        int[][] arr = {
            {10, 20, 30, 40},
            {100, 200, 300, 400},
            {1000, 2000, 3000, 4000},
            {10000, 20000, 30000, 40000},
        };

        print2d(arr);
        transpose(arr);
        System.out.println("**************************");
        print2d(arr);
    }

    static void transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void print2d(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}