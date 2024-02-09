package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] classmates = {"Neo Graves","Ieuan Davis","Byron Kane","Inayah Davies","Alivia Mckenzie",
                "Dhruv Holloway","Ali Vega","Julie Griffith","Asia Peck","Ayden Espinoza"};

        getInitials(classmates);

    }


    private static void getInitials(String[] classmates) {

        String[] initials = new String[classmates.length];

        for (int i = 0; i < classmates.length; i++) {
            initials[i] = "" + classmates[i].charAt(0) + classmates[i].charAt(classmates[i].indexOf(" ")+1);
            System.out.println(initials[i]);

        }

    }
}
