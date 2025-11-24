import java.util.*;
import java.lang.*;

public class functions_that_return {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Please give me a number");
        int n = scn.nextInt();

        boolean isPrime = IsPrime(n);
        if(isPrime){
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
        
    }

    public static boolean IsPrime(int num){
        int count = 0;

        for(int div = 2; div <= num - 1; div++){
            int rem = num % div;

            if(rem == 0){
                count++;
            }
        }

        if(count == 0){
            return true;
        } else {
            return false;
        }
    }


}