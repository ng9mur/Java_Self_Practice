package day04_practice_tasks;

public class Grade {
    /*
    5. Create a class called Grade. A char variable named grade is given.
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
        char grade = 'b';
        String message = "";
        if (grade == 'A' || grade == 'a') {
            message = "Excellent";
        } else if (grade == 'B' || grade == 'b') {
            message = "Great job";
        } else if (grade == 'C' || grade == 'c') {
            message = "Good";
        } else if (grade == 'D' || grade == 'd') {
            message = "Passed";
        } else if (grade == 'F' || grade == 'f') {
            message = "Failed";
        } else {
            message = "Invalid grade";
        }
        System.out.println(message);
    }
}
