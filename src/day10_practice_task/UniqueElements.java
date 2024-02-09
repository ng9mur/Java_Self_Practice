package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2,3,7,-11, 3, 4, 5, 5));
        System.out.println(findUnique(list));


    }

    private static ArrayList<Integer> findUnique(ArrayList<Integer> list) {
        list.removeIf(b -> Collections.frequency(list,b) >1);
        return list;
    }
}
