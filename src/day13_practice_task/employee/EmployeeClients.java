package day13_practice_task.employee;

public class EmployeeClients {
    public static void main(String[] args) {
        Developer developer = new Developer("Sam",22,"1","developer",120_000,"Apple","JavaScript");
        System.out.println(developer);
        developer.work();

        Teacher teacher = new Teacher("Bob",56,"1","teacher",120_000,"School");
        System.out.println(teacher);
        teacher.work();

        Tester tester = new Tester("Helen",45,"2","tester",120_000,"Google");
        System.out.println(tester);
        tester.work();
    }

}
