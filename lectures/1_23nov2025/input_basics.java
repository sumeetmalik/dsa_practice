import java.util.*;

public class input_basics {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("What is on your mind?");
        
        String str = scn.nextLine();
        System.out.println("You said:");
        System.out.println(str);
    }
}