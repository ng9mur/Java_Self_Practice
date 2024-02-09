package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,5,0,2,0,3,0,4));
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);



    }
}
