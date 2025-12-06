import java.lang.*;
import java.util.*;

public class wave_display {
    public static void main(String[] args){
        int[][] arr = {
            {2, 5, 6, 4},
            {3, 1, 7, 0},
            {1, 1, 2, 7},
            {9, 4, 3, 1}
        };
        wavedisplay(arr);
    }

    static void wavedisplay(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        for(int j = 0; j < c; j++){
            if(j % 2 == 0){
                for(int i = 0; i < r; i++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for(int i = r - 1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}