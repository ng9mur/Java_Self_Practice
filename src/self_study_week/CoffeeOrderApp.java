package self_study_week;

import java.util.Scanner;

public class CoffeeOrderApp {
    public static double blackCoffeePrice = 5.0;
    public static double lattePrice = 7.0;
    public static double cappuccinoPrice = 7.0;
    public static double totalPrice ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        greetCustomer(scanner);

    }

    private static void greetCustomer(Scanner scanner) {
        System.out.println("Welcome to the Coffee Order App!");
        System.out.println("Would you like to order coffee?");
        String customerResponse = scanner.next();
        while (!(customerResponse.equalsIgnoreCase("yes") || customerResponse.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input. Please re-enter a valid response");
            customerResponse = scanner.next();
        }
        if (customerResponse.equalsIgnoreCase("no")) {
            System.out.println("Thanks for using our service!");
        }else if(customerResponse.equalsIgnoreCase("yes")){
            orderCoffee(scanner);
        }
    }

    public static void orderCoffee(Scanner scanner) {
            System.out.println("Coffee Options:");
            System.out.println("1. Black Coffee - "+blackCoffeePrice +"\n2. Latte - "+lattePrice+"\n3. Cappuccino - "+cappuccinoPrice);
            System.out.println("Pick a coffee:");
            int coffeeChoice = scanner.nextInt();
            while (!(coffeeChoice == 1 || coffeeChoice == 2 || coffeeChoice == 3)) {
                System.out.println("Invalid choice, please re-enter");
                coffeeChoice = scanner.nextInt();
            }
            if (coffeeChoice == 1) {
                System.out.println("Added Black Coffee to Your Order.");
                totalPrice +=blackCoffeePrice;
            } else if (coffeeChoice == 2) {
                System.out.println("Added Latte to Your Order.");
                totalPrice += lattePrice;
            } else {
                System.out.println("Added Cappuccino to Your Order.");
                totalPrice+=cappuccinoPrice;
            }

        System.out.println("Would you like another order?");
        String customerResponse2 = scanner.next();
        while (!(customerResponse2.equalsIgnoreCase("yes") || customerResponse2.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input. Please re-enter a valid response");
            customerResponse2 = scanner.next();
        }
        if (customerResponse2.equalsIgnoreCase("no")){
            System.out.println("Your total is: " + totalPrice);
        } else if (customerResponse2.equalsIgnoreCase("yes")) {
            orderCoffee(scanner);
        }
    }
        }



