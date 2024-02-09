package day04_practice_tasks;

public class Finra {
    /*
    3. Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA
     */
    public static void main(String[] args) {
        int number = 8;
        String word = "";
        if (number % 3 == 0 && number %5 != 0){
            word = "FIN";
        } else if (number%5 == 0 && number % 3 != 0) {
            word = "RA";
        }else if (number%3 == 0 && number % 5 == 0){
            word = "FINRA";
        }else {
            System.out.println(number);
        }
        System.out.println(word);
    }
}
