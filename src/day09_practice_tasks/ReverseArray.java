package day09_practice_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,7,89,434,24,6,77,15};
        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
