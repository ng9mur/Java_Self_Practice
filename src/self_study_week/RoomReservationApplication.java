package self_study_week;

import java.util.Scanner;

public class RoomReservationApplication {
    public static double roomFee;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        roomReservationApp(scanner);
    }

    private static void roomReservationApp(Scanner scanner) {
        System.out.println("Welcome to the Cydeo Skyline Inn!");
        System.out.println("Would you like to reserve a room? (Yes/No)");
        String userInput = scanner.next();
        while (!(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input , please re-enter");
            userInput = scanner.next();
        }
        if (userInput.equalsIgnoreCase("no")) {
            System.out.println("You have a wonderful day!");
        } else if (userInput.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your first name:");
            scanner.nextLine();
            String firstName = scanner.nextLine();
            System.out.println("Please enter your last name:");
            String lastName = scanner.nextLine();
            System.out.println("Please enter your age:");
            int age = scanner.nextInt();
            while (!(age >= 18)) {
                System.out.println("Invalid input , please re-enter");
                age = scanner.nextInt();
            }
            System.out.println("Here are our available rooms and their prices:");
            System.out.println("\tKing Bed   ===== $160\n\tQueen Bed  ===== $120\n\tSingle Bed ===== $100");
            System.out.println("Which room would you like to reserve? (King/Queen/Single)");
            String roomType = scanner.next();
            while (!(roomType.equalsIgnoreCase("King") || roomType.equalsIgnoreCase("Queen") || roomType.equalsIgnoreCase("Single"))) {
                System.out.println("Invalid input , please re-enter");
                roomType = scanner.next();
            }
            double roomPrice = 0;
            switch (roomType) {
                case "King", "king" -> roomPrice = 160;
                case "Queen", "queen" -> roomPrice = 120;
                case "Single", "single" -> roomPrice = 100;
            }
            System.out.println("How many nights would you like to stay?");
            int nightsToStay = scanner.nextInt();
            while (!(nightsToStay > 0)) {
                System.out.println("Invalid input , please re-enter");
                nightsToStay = scanner.nextInt();
            }
            roomFee = roomPrice * nightsToStay;
            System.out.println("Are you a veteran? (Yes/No)");
            String veteranStatus = scanner.next();
            while (!(veteranStatus.equalsIgnoreCase("yes") || veteranStatus.equalsIgnoreCase("no"))) {
                System.out.println("Invalid input , please re-enter");
                veteranStatus = scanner.next();
            }
            if (veteranStatus.equalsIgnoreCase("yes")) {
                roomFee = roomFee - (roomFee * 0.15);
            }

            if (age >= 64) {
                roomFee = roomFee - (roomFee * 0.1);
            }
            double feeWithTaxes = roomFee * 0.08;

            System.out.println("Hello " + firstName + ", You have selected " + roomType + " Bed for " + nightsToStay + " nights to stay.");
            System.out.println("Room fee: $" + roomFee);
            System.out.println("Tax is: $" + feeWithTaxes);
            System.out.println("Your grand total is: $" + (roomFee + feeWithTaxes));


        }


    }
}

