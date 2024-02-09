package day11_practice_task;

public class CydeoStudent {
    public String name;
    public int age;
    public int id;
    public int grade;
    public int batchNumber;
    public int groupNumber;
    public static final String SCHOOL_NAME = "Cydeo";
    public static final String PROGRAMMING_LANGUAGE = "Java";

    public CydeoStudent(String name, int age, int id, int grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
}
