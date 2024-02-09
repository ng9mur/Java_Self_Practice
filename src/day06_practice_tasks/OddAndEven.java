package day06_practice_tasks;

public class OddAndEven {
    /*
    1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output: true
     */
    public static void main(String[] args) {

        System.out.println(isOdd(75));
        System.out.println(isEven(66));
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
