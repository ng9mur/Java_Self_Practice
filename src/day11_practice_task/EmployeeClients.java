package day11_practice_task;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Josh");
        Employee employee2 = new Employee("Chris",56);
        Employee employee3 = new Employee("Mary",35,'F');
        Employee employee4 = new Employee("Dakota",25,'F',"Senior SDET");
        Employee employee5 = new Employee("Mike",80,'M',"CEO",300_000);
        Employee employee6 = new Employee("Emily",32,'F',"Marketing team",75_000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);

    }
}
