import java.lang.*;
import java.util.*;

public class remove_odds {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(34);
        list.add(49);
        list.add(57);
        list.add(44);
        list.add(60);
        System.out.println(list);
        removeOdds(list);
        System.out.println(list);
    }

    static void removeOdds(List<Integer> list){
        for(int i = list.size() - 1; i >= 0; i--){
            int val = list.get(i);
            if(val % 2 == 1){
                list.remove(i);
            }
        }
    }
}