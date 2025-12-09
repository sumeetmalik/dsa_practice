import java.lang.*;
import java.util.*;

public class intro_to_arraylist {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(2));    
        // System.out.println(list.get(5)); 

        list.set(0, 100);
        System.out.println(list);

        list.add(1, 1000);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        for(int val: list){
            System.out.println(val);
        }

        for(int i = 0; i < list.size(); i++){
            int val = list.get(i);
            val += 10;
            list.set(i, val);
        }
    }
}