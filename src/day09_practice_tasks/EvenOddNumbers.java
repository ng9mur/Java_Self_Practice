package day09_practice_tasks;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,23,45,66,77,86,89,900,0,-2,7886,7};
        countEvenAndOddNums(arr);
    }

    private static void countEvenAndOddNums(int[] arr) {
        int oddNumsCount = 0;
        int evenNumsCount = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenNumsCount += 1;
            } else {
                oddNumsCount +=1;

            }
        }
        System.out.println("The array has " + oddNumsCount + " odd numbers and "+evenNumsCount+" even numbers.");
    }
}
