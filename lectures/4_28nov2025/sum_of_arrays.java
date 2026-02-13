import java.util.*;
import java.lang.*;

public class sum_of_arrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3};
        int[] arr2 = {4, 6};

        printArray(arr1);
        printArray(arr2);

        int[] sum = addition(arr1, arr2);
        printArray(sum);
    }

    static int[] addition(int[] arr1, int[] arr2){
        int[] sum = new int[arr1.length < arr2.length? arr2.length + 1: arr1.length + 1];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        int carry = 0;
        while(k >= 0){
            // work

            int dig = carry;

            if(i >= 0){
                dig += arr1[i];
            }

            if(j >= 0){
                dig += arr2[j];
            }

            carry = dig / 10;
            sum[k] = dig % 10;

            i--;
            j--;
            k--;
        }

        return sum;
    }

    static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val + ", ");
        }

        System.out.println(".");
    }
}