package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida"));
        System.out.println(sameFirstAndLast(list));;
    }

    private static ArrayList<String> sameFirstAndLast(ArrayList<String> list) {
        System.out.println("========== 1st option =============");

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
                if (!(s.charAt(0) + "").equalsIgnoreCase(s.charAt(s.length()-1)+"")){
                list2.add(s);
            }
        }
        return list2;

      //  System.out.println("========== 2nd option =============");

//        list.removeIf( i -> (""+i.charAt(0)).equalsIgnoreCase( ""+i.charAt(i.length()-1) ) );
//        return list;



    }
}
