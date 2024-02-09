package self_study_week;

import java.util.Scanner;

public class ATMSimulation {
    public static int pinNumber = 7890;
    public static double accountBalance = 90000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        enterPinNum(scanner);
    }

    private static void enterPinNum(Scanner scanner) {
        System.out.println("Enter you pin number");
        int userPin = scanner.nextInt();
        int i =0;

        for ( i = 0; i < 2; i++) {

            if (userPin == pinNumber) {
                selectOptions(scanner);
            } else {
                System.out.println("Incorrect Pin Number, Please re-enter:");
                userPin = scanner.nextInt();
            }
        }
            if (i == 2 && pinNumber !=userPin ){
                System.out.println("Your card is locked. Please contact with your local bank");

            }


        }


    private static void selectOptions(Scanner scanner) {
        System.out.println("Select from one of the three following options:");
        System.out.println("1.Check Balance\n2.Deposit Money\n3.Withdraw Money");
        int options = scanner.nextInt();
        switch (options){
            case 1 -> checkBalance();
            case 2 -> depositMoney(scanner);
            case 3 -> withdrawMoney(scanner);
            default -> invalidInput();
        }
    }

    private static void invalidInput() {
        System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.println("Enter the amount to withdraw");
        double amountToWithdraw = scanner.nextDouble();
        if (amountToWithdraw<=0){
            System.err.println("Cannot withdraw zero or negative amount, please try again later.");
            return;
        } else if (amountToWithdraw>accountBalance) {
            System.err.println("Insufficient funds. Withdrawal failed.");
            return;
        }
        accountBalance-=amountToWithdraw;
        checkBalance();
    }

    private static void depositMoney(Scanner scanner) {
        System.out.println("Enter the amount to deposit");
        double depositedAmount = scanner.nextDouble();
        if (depositedAmount<=0){
            System.err.println("Depositing amount cannot be zero or negative, please try again later.");
            return;
        }
        accountBalance += depositedAmount;
        checkBalance();
    }

    private static void checkBalance() {
        System.out.println("Your account balance is: " + accountBalance);
    }

}


