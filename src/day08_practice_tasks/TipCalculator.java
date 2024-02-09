package day08_practice_tasks;

import java.util.Scanner;
/*
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75
 */
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tipCalculator(scanner);
    }

    public static void tipCalculator(Scanner scanner) {

        System.out.println("Split or No split (Yes or No)?");
        String splitNoSplit = scanner.next();
        System.out.println("Enter the number of people:");
        int numOfPeople = scanner.nextInt();
        System.out.println("Enter the check amount:");
        double checkAmount = scanner.nextDouble();
        System.out.println("Service Quality (Excellent/Great/Good/Fair/Poor): ");
        String serviceQuality = scanner.next();
        scanner.close();

        double totalTip = 0;

        switch (serviceQuality) {
            case "Excellent", "excellent" -> totalTip = checkAmount * 0.25;
            case "Great", "great" -> totalTip = checkAmount * 0.20;
            case "Good", "good" -> totalTip = checkAmount * 0.15;
            case "Fair", "fair" -> totalTip = checkAmount * 0.10;
            case "Poor", "poor" -> totalTip = checkAmount * 0.05;
            default -> totalTip = totalTip;

        }
        double totalToPay = checkAmount + totalTip;
        System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalToPay / numOfPeople);
        System.out.println("Tip per person: " + totalTip / numOfPeople);
    }
}
