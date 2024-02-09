package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));
        System.out.println(removeLetters(list));
    }

    private static ArrayList<Character> removeLetters(ArrayList<Character> list) {

        ArrayList<Character> list2 = new ArrayList<>();

        for (Character c : list) {
            if (!Character.isLetter(c)){
                list2.add(c);
            }
        }
        return list2;

    }
}