package day08_practice_tasks;

public class EmailTask2 {
    /*
    5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
     */
    public static void main(String[] args) {
        printInfoFromEmail("craig_fedeRigHi@apple.com");
        printInfoFromEmail("miKe_tySon@gmail.com");
    }

    public static void printInfoFromEmail(String email) {
        int indexOfUnderscore = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfDot = email.indexOf(".");
        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, indexOfUnderscore).toLowerCase();
        String lastName = email.substring(indexOfUnderscore + 1, indexOfUnderscore + 2).toUpperCase() + email.substring(indexOfUnderscore + 2, indexOfAt).toLowerCase();
        String domain = email.substring(indexOfAt + 1, indexOfDot);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
    }
}
