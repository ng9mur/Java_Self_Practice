package day03_practice_tasks;

public class KilosToPounds {
    /*
    Create a class named KilosToPounds and declare the following variables:
              		kg
              		lb

     Write a program that can convert any given number of kilos to pounds.

	        		Example:
	              			kg = 10.5

	        		Output:
	              			10.5 kilos is equal to 23.1 pounds

        		Hint:  1kg = 2.2 lb
     */
    public static void main(String[] args) {
        double kg = 10.5;
        double lb = kg * 2.2;
        System.out.println(kg+" kilos is equal to "+lb+" pounds");
    }
}
