package day03_practice_tasks;

public class GallonsToLiters {
    /*
    Create a class named GallonsToLiters and declare the following variables:
					gallon
					liters

	Write a program that converts any given number of gallons to liters.

					Example:
						gallon = 10

					Output:
						10 gallons is equal to 37.9 liters

			Hint: 1 gallon = 3.79 liters
     */
    public static void main(String[] args) {
        double gallons = 10;
        double liters = gallons * 3.79;
        System.out.println(gallons + " gallons is equal to "+ liters + " liters");
    }
}
