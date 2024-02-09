package day10_practice_task;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,56,7,0,76,3,3,0,97,89,4,89,97,56,4));

        System.out.println(removeDuplicate(list));

    }

    private static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {

        ArrayList list2 = new ArrayList<>();
        for (Integer i : list) {
            if (!list2.contains(i)){
                list2.add(i);
            }
        }

        return list2;

        }




    }

