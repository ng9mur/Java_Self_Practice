package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {



    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(2,5,1020,0,6,-1234,8,9,-1905,44506,566,799));
        findMaxAndMin(list);
    }

    private static void findMaxAndMin(ArrayList<Integer> list) {
        System.out.println("=========== 1st option =========");
        int max = list.get(0);
        int min = list.get(0);
        for (int i = 0; i < list.size();i++) {
            if (list.get(i) >max){
                max = list.get(i);
            }

            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

        System.out.println("=========== 2nd option =========");

        System.out.println("Maximum number is " +  Collections.max(list));
        System.out.println("Minimum number is " +Collections.min(list));
    }

}
