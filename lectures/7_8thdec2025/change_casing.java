import java.lang.*;
import java.util.*;

public class change_casing {
    // print all chars
    // convert lower case to upper case 
    // convert upper case to lower case
    // print numbers as it is
    // For symbols print an asterik
    public static void main(String[] args){
        String str = "elEPHanT@ c@VE5";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                char uc = (char)(ch - 'a' + 'A');
                System.out.println(uc);
            } else if (ch >= 'A' && ch <= 'Z'){
                char lc = (char)(ch - 'A' + 'a');
                System.out.println(lc);
            } else if(ch >= '0' && ch <= '9') {
                System.out.println(ch);
            }
            else {
                System.out.println("*");
            }
        }
    }
}