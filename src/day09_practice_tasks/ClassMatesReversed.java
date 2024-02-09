package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] classmates = {"Neo Graves","Ieuan Davis","Byron Kane","Inayah Davies","Alivia Mckenzie",
                "Dhruv Holloway","Ali Vega","Julie Griffith","Asia Peck","Ayden Espinoza"};


        for (int i = 0; i < classmates.length; i++) {
            StringBuilder s = new StringBuilder(classmates[i]) ;
            classmates[i] = s.reverse().toString();
            System.out.println(classmates[i]);
        }

    }
}
