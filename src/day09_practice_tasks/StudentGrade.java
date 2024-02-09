package day09_practice_tasks;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah", "Lily", "Tom", "Greg"};
        int[] scores = {90, 75, 80, 55, 30, 60};
        printStudentsGrade(names, scores);
    }

    private static void printStudentsGrade(String[] names, int[] scores) {
        char[] grades = new char[names.length];
        for (int i = 0, j = 0; i < scores.length; i++, j++) {

            if (scores[i] >= 90 && scores[i] <= 100) {
                grades[j] = 'A';
            } else if (scores[i] >= 80 && scores[i] <= 89) {
                grades[j] = 'B';
            } else if (scores[i] >= 70 && scores[i] <= 79) {
                grades[j] = 'C';
            } else if (scores[i] >= 60 && scores[i] <= 69) {
                grades[j] = 'D';
            } else if (scores[i] >= 0 && scores[i] <= 59) {
                grades[j] = 'F';
            }

            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }
        System.out.println(Arrays.toString(grades));


    }

}