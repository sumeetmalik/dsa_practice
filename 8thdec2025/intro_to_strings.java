import java.lang.*;
import java.util.*;

public class intro_to_strings {
    public static void main(String[] args){
        String str = "Hello";
        System.out.println(str);

        // How to get an individual character
        // Can't use str[0], you have to use str.charAt(0)
        char ch = str.charAt(0);

        // How to get the length of array in string
        // Can't use str.length, you have to use str.length()
        System.out.println(str.length());

        // How to set value of a char
        // Can't use arr[0] = 'B'
        // Strings are immutable, you can't change value at any location

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            System.out.println(ch);
        }

        // hello
        System.out.println(str.substring(1, 3));
        System.out.println(str.substring(1, 5));
        // System.out.println(str.substring(1, 6));

        String str1 = "hell";
        String str2 = "bell";
        String str3 = str1 + str2;
        System.out.println(str3);
    }
}