package day02_practice_tasks;

public class PhoneNumber {
    /*
     Create a class named PhoneNumber and declare the following variables:
		countryCode
		areaCode
		localNumber

	Use string concatenation to display the phone number.

		Example:
			countryCode = 1;
		      areaCode = 703;
		      localNumber = 4512625;

		Output:
			Phone number is: +1(703)-4512625

     */
    public static void main(String[] args) {
        String countryCode = "1";
        String areaCode = "646";
        String localNumber = "4518067";
        System.out.println("Phone number is: +"+ countryCode+"("+areaCode+")-"+localNumber);
    }
}
