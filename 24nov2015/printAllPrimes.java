import java.util.*;
import java.lang.*;

public class printAllPrimes {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Please give me a number");
        int n = scn.nextInt();

        for(int i = 2; i <= n; i++){
            boolean isPrime = IsPrime(i);
            if(isPrime){
                System.out.println(i);
            }
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