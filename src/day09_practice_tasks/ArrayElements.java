package day09_practice_tasks;


import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
            System.out.print(nums[i] + " ");

        }
        System.out.println();

        System.out.println("================================");

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        System.out.println("================================");

        for (int num : nums) {
            if (num % 5 ==0) {
                System.out.print(num + " ");
            }

        }



    }
}
