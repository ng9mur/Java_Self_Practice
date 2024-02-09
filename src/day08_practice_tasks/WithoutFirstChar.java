package day08_practice_tasks;

import java.util.Scanner;
/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */
public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println(word1.substring(1) + word2.substring(1));
        scanner.close();
    }
}
