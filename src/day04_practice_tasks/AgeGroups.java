package day04_practice_tasks;

public class AgeGroups {
    /*
    8. Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
     */
    public static void main(String[] args) {
        int age = 145;
        boolean valid = age >= 0 && age <= 150;
        String group = "";
        if (valid) {
            if (age <= 20) {
                group = "Teenager";
            } else if (age <= 55) {
                group = "Adult";
            } else {
                group = "Senior";
            }

        }else {
            group = "Invalid";
        }
        System.out.println(group);
    }
}
