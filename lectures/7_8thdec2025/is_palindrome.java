import java.lang.*;
import java.util.*;

public class is_palindrome {
    
    public static void main(String[] args){
        System.out.println(IsPalindrome("nitin"));
        System.out.println(IsPalindrome("malayalam"));
        System.out.println(IsPalindrome("abccba"));
        System.out.println(IsPalindrome("abccda"));
    }

    public static boolean IsPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left <= right){
            char lc = str.charAt(left);
            char rc = str.charAt(right);

            if(lc == rc){
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}