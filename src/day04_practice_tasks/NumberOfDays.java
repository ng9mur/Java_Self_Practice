package day04_practice_tasks;

public class NumberOfDays {
    /*
    12. Create a class named NumberOfDays. An integer variable named month is given.
	Write a program to determine the number of days in a given month.

			Example:
				   month = 5

			Output:
				   31 days

			(Assume that February has 28 days)

		If the given month number is not between 1~12, then print "Invalid."

		Hints:
			Months with 31 days: 1, 3, 5, 7, 8, 10, 12
			Months with 30 days: 4, 6, 9, 11
     */
    public static void main(String[] args) {
        int monthNum = 8;
        int days = 0;
        switch (monthNum) {
            case 1 -> days = 31;
            case 2 -> days = 28;
            case 3 -> days = 31;
            case 4 -> days = 30;
            case 5 -> days = 31;
            case 6 -> days = 30;
            case 7 -> days = 31;
            case 8 -> days = 31;
            case 9 -> days = 30;
            case 10 -> days = 31;
            case 11 -> days = 30;
            case 12 -> days = 31;
            default -> System.out.println("Invalid");

        }
        System.out.println(days);
    }
}
