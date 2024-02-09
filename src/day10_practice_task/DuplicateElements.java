package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("list = " + list);




    }
}
