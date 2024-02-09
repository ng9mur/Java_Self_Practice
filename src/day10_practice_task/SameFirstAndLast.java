package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida"));
        System.out.println(sameFirstAndLast(list));;
    }

    private static ArrayList<String> sameFirstAndLast(ArrayList<String> list) {

        list.removeIf( i -> (""+i.charAt(0)).equalsIgnoreCase( ""+i.charAt(i.length()-1) ) );
        return list;
    }
}
