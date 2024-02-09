package day13_practice_task.employee;

public class Teacher extends Employee{
    public Teacher(String name, int age, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
