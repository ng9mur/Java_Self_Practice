package day10_practice_task;

import java.util.Arrays;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "Woode%&n Spo55on123!$#";
        char[] ch = str.toCharArray();
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                digits += ch[i];
            } else if (Character.isLetter(ch[i])) {
                letters += ch[i];
            } else if (!Character.isLetterOrDigit(ch[i])) {
                specialChars += ch[i];

            }
        }
        System.out.println("specialChars = \"" + specialChars + "\"");
        System.out.println("digits = \"" + digits + "\"");
        System.out.println("letters = \"" + letters + "\"");


    }
}
