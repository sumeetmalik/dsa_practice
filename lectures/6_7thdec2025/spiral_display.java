import java.util.*;
import java.lang.*;

public class spiral_display {
    public static void main(String[] args){
        int[][] arr = {
            {10, 11, 12, 13, 14, 15, 16},
            {20, 21, 22, 23, 24, 25, 26},
            {30, 31, 32, 33, 34, 35, 36},
            {40, 41, 42, 43, 44, 45, 46},
            {50, 51, 52, 53, 54, 55, 56}
        };

        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;

        int nel = arr.length * arr[0].length;
        int counter = 1;

        while(counter <= nel){
            // west wall: 
            // col is fixed at minc and
            // row varies from minr to maxr
            for(int i = minr, j = minc; i <= maxr && counter <= nel; i++){
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            minc++;

            // south wall:
            // row is fixed at maxr
            // col varies from minc to maxc
            for(int i = maxr, j = minc; j <= maxc && counter <= nel; j++){
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            maxr--;

            // east wall:
            for(int i = maxr, j = maxc; i >= minr && counter <= nel; i--){
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            maxc--;

            // north wall
            for(int i = minr, j = maxc; j >= minc && counter <= nel; j--){
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            minr++;
        }
    }
}