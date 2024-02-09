package day07_practice_tasks;

import java.util.Scanner;
/*
7. Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B
 */

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = input.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your grade is C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your grade is D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid score");
        }
        input.close();
    }

}
