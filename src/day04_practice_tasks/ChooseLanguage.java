package day04_practice_tasks;

public class ChooseLanguage {
    /*
    1. Create a class named ChooseLanguage. Given an integer variable named selection that has a
number between 1~5, write a program that selects the language based on the number provided in
the selection and prints the following message:

		for 1: Hello, thank you for your call
		for 2: Hola, gracias por llamar
		for 3: Merhaba, aradığınız için teşekkürler
		for 4: Привет, спасибо за ваш звонок
		for 5: Merci, pour votre appel

			Example:
				   selection = 3;

			Output:
				  Merhaba, aradiginiz icin tesekkurler
     */
    public static void main(String[] args) {

        int selection = 3;
        String message = "";
        if (selection == 1) {
            message = "Hello, thank you for your call";
        } else if (selection == 2) {
            message = "Hola,gracias por llamar";
        } else if (selection == 3) {
            message = "Merhaba, aradığınız için teşekkürler";
        } else if (selection == 4) {
            message = "Привет, спасибо за ваш звонок";
        } else if (selection == 5) {
            message = "Merci, pour votre appel";
        } else {
            message = "Invalid input";
        }
        System.out.println(message);
    }
}
