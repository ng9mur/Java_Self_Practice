package day08_practice_tasks;

import java.util.Scanner;
/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */

public class StartsWithX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.next();
        if (word.startsWith("x")) {
            word = word.replaceFirst("x", "a");
        }
        System.out.println("word = " + word);
        scanner.close();
    }
}
