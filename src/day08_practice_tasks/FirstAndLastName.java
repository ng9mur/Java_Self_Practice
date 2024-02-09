package day08_practice_tasks;

import java.util.Scanner;
/*
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */
public class FirstAndLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(printInFormat(scanner));
    }

    public static String printInFormat(Scanner scanner) {
        System.out.println("Enter the first name:");
        String firstName = scanner.next();
        System.out.println("Enter the last name:");
        String lastName = scanner.next();
        scanner.close();
        String fullName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() +
                " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        return fullName;

    }
}
