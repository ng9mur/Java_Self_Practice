package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultipOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int  odd =0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0){
                Collections.replaceAll(list,list.get(i),list.get(i) *2);
            }

        }
        System.out.println("list = " + list);
    }
}
