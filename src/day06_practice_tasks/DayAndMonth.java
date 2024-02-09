package day06_practice_tasks;

public class DayAndMonth {
    /*
    4. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days

     */
    public static void main(String[] args) {
        System.out.println(day(7));
        System.out.println(day(-1));
        System.out.println(monthName(11));
        daysInMonth(5);

    }

    public static String day(int num) {
        String result = "";
        switch (num) {
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
            default -> result = "Invalid number";
        }
        return result;
    }

    public static String monthName(int num) {
        String result = "";
        switch (num) {
            case 1 -> result = "January";
            case 2 -> result = "February";
            case 3 -> result = "March";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            case 7 -> result = "July";
            case 8 -> result = "August";
            case 9 -> result = "September";
            case 10 -> result = "October";
            case 11 -> result = "November";
            case 12 -> result = "December";
            default -> result = "Invalid number";
        }
        return result;
    }

    public static void daysInMonth(int num) {

        switch (num) {
            case 1 -> System.out.println("January has 31 days");
            case 2 -> System.out.println("February has 28 or 29 days");
            case 3 -> System.out.println("March has 30 days");
            case 4 -> System.out.println("April has 30 days");
            case 5 -> System.out.println("May has 31 days");
            case 6 -> System.out.println("June has 30 days");
            case 7 -> System.out.println("July has 31 days");
            case 8 -> System.out.println("August has 31 days");
            case 9 -> System.out.println("September has 30 days");
            case 10 -> System.out.println("October has 1 days");
            case 11 -> System.out.println("November has 30 days");
            case 12 -> System.out.println("December has 31 days");
            default -> System.out.println("Invalid number");

        }
    }
}
