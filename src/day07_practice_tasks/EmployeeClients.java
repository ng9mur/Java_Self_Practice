package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Chris";
        employee1.age = 34;
        employee1.gender = 'M';
        employee1.jobTitle = "Software Engineer";
        employee1.salary = 155_000;

        employee1.work();
        System.out.println("employee1 = " + employee1);

            Employee employee2 = new Employee();
            employee2.name = "Vanessa";
            employee2.age = 27;
            employee2.gender = 'F';
            employee2.jobTitle = "Scrum Master";
            employee2.salary = 165_000;

            employee2.work();
            System.out.println("employee2 = " + employee2);

        Employee employee3 = new Employee();
        employee3.name = "John";
        employee3.age = 45;
        employee3.gender = 'M';
        employee3.jobTitle = "Product Owner";
        employee3.salary = 200_000;

        employee3.work();
        System.out.println("employee3 = " + employee3);
        }
    }

