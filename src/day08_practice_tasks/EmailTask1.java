package day08_practice_tasks;

public class EmailTask1 {
    /*
    4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
     */
    public static void main(String[] args) {

        String email = "craig_federighi@gmail.com";
        String email2 = "miketyson@gmail.com";
        System.out.println(swapFirstAndLastNames(email));
        System.out.println(swapFirstAndLastNames(email2));

    }

    public static String swapFirstAndLastNames(String email) {
        if (email.contains("_")) {
            int indexOfUnderscore = email.indexOf("_");
            int indexOfAt = email.indexOf("@");
            String firstName = email.substring(0, indexOfUnderscore);
            String lastName = email.substring(indexOfUnderscore + 1, indexOfAt);
            email = lastName + "_" + firstName + email.substring(indexOfAt);
        }
        return email;
    }
}
