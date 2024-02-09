package day09_practice_tasks;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
      int[]  array = {10, 0, 5, 0, 1, 0};
      System.out.println(Arrays.toString(moveTheZeros(array)));
    }

    private static int[] moveTheZeros(int[] array) {
        int[] newArray = new int[array.length];
        Arrays.sort(array);
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }


}
