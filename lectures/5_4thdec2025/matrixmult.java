import java.lang.*;
import java.util.*;

public class matrixmult {
    public static void main(String[] args){
        int[][] a = {
            {1, 0, 1},
            {2, 0, 3}
        };
        int[][] b = {
            {1, 1, 0, 0},
            {0, 1, 0, 2},
            {2, 0, 3, 0}
        };

        int[][] c = multiply(a, b);

        if(c == null){
            System.out.println("These matrices can't be multiplied");
        } else {
            print2d(a);
            System.out.println("*****************");
            print2d(b);
            System.out.println("*****************");
            print2d(c);
        }
    }

    static int[][] multiply(int[][] a, int[][] b){
        int r1 = a.length;
        int c1 = a[0].length;

        int r2 = b.length;
        int c2 = b[0].length;

        if(c1 == r2){
            // can be multiplied
            int[][] c = new int[r1][c2];

            for(int i = 0; i < r1; i++){
                for(int j = 0; j < c2; j++){
                    int sum = 0;

                    for(int k = 0; k < c1; k++){
                        int prd = a[i][k] * b[k][j];
                        sum += prd;
                    }

                    c[i][j] = sum;
                }
            }

            return c;
        } else {
            return null;
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