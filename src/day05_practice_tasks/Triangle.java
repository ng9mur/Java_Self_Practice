package day05_practice_tasks;

public class Triangle {
    /*
    7. Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
     */
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
}
