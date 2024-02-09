package day06_practice_tasks;

public class MaximumAndMinimum {
    /*
    3. Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100
     */
    public static void main(String[] args) {
        System.out.println("Maximum of two int values: " + max(543, 567));
        System.out.println("Maximum of two double values: " + max(456.4, 123.8));
        System.out.println("Minimum of two int values: " + min(64859, 69857));
        System.out.println("Minimum of two double values: " + min(465.78, -4657.78));
    }

    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }

    public static double min(double num1, double num2) {
        return (num1 < num2) ? num1 : num2;
    }
}