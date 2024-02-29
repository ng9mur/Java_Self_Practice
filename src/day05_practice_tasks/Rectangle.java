package day05_practice_tasks;

public class Rectangle {
    /*
    1. Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *

     */
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.print("\t\t\t");
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//        for (int i = 0; i < 9; i++) {
//            System.out.println("\t\t\t* * * * * * * *");
//        }
//
//    }


}
