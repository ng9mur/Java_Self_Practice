package day13_practice_task.employee;

import day13_practice_task.employee.Employee;

public class Tester extends Employee {

    public Tester(String name, int age, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, employeeId, jobTitle, salary, companyName);
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }
}
