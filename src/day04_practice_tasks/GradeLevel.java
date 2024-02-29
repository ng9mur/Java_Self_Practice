package day04_practice_tasks;

public class GradeLevel {
    /*
    6. Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
     */
    public static void main(String[] args) {
        byte gradeLevel = 17;
        String schoolType = "";
        boolean validNumber = gradeLevel >= 1 && gradeLevel <= 18;
        if (validNumber) {
            if (gradeLevel <= 5) {
                schoolType = "Elementary school";
            } else if (gradeLevel <= 8) {
                schoolType = "Middle school";
            } else if (gradeLevel <= 12) {
                schoolType = "High school";
            } else if (gradeLevel <= 16) {
                schoolType = "College";
            } else {
                schoolType = "Grad School";
            }
        }else {
            schoolType = "Invalid grade level";
        }
        System.out.println(schoolType);
    }
}
