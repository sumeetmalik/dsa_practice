import java.util.*;
import java.lang.*;

public class input_to_variables {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Please give me an integer value");
        int i = Integer.parseInt(scn.nextLine(), 10);
        
        System.out.println("Please give me a string value");
        String str = scn.nextLine();

        System.out.println("Please give me a decimal value");
        double db = Double.parseDouble(scn.nextLine());

        System.out.println("Please give me a charachter value");
        char ch = scn.nextLine().charAt(0);

        System.out.println("Your integer value: " + i);
        System.out.println("Your string value: " + str);
        System.out.println("Your double value: " + db);
        System.out.println("Your charachter value: " + ch);
    }
}