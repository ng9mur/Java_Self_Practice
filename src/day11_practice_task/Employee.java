package day11_practice_task;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this(name);
        this.age = age;
    }

    public Employee(String name, int age, char gender) {
        this(name,age);
        this.gender = gender;
    }

    public Employee(String name, int age, char gender, String jobTitle) {
        this(name,age,gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this(name, age, gender, jobTitle);
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle + name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
