package day04_practice_tasks;

public class Grade2 {
    /*
    9. Create a class called Grade2. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				   Great job
     */
    public static void main(String[] args) {
        char grade = 'F';
        String message = "";
        switch (grade){
            case 'A' -> message = "Excellent";
            case 'B' -> message = "Great job";
            case 'C' -> message = "Good";
            case 'D' -> message = "Passed";
            case 'F' -> message = "Failed";
            default -> message = "Invalid grade";

        }
        System.out.println(message);
    }
}
