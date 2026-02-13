import java.util.*;
import java.lang.*;

public class intro2d {
    public static void main(String[] args){
        /*
        int[][] arr = new int[3][4];

        arr[0][0] = 100;
        arr[0][1] = 10;
        arr[0][2] = 50;
        arr[0][3] = 50;
        arr[1][0] = 7;
        arr[1][1] = 24;
        arr[1][2] = 2;
        arr[1][3] = 8;
        arr[2][0] = 20;
        arr[2][1] = 9;
        arr[2][2] = 32;
        arr[2][3] = 30;
        */

       int[][] arr = {
            {100, 10, 50, 50},
            {7, 24, 2, 8},
            {20, 9, 32, 30}
       };

        print2d(arr);
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

