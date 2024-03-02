package day13_practice_task.employee;

public class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    private double salary;
    private String companyName;

    public Employee(String name, int age, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.trim().isEmpty()) {
            System.err.println("Employee ID cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.trim().isEmpty()) {
            System.err.println("Job title cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Salary must be greater than zero.");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.trim().isEmpty()) {
            System.err.println("Company name cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is working.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                "} " ;
    }
}
