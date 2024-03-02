package day13_practice_task.employee;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName(){

        return name;
    }

    public void setName(String name){
        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid input/data for the name: " + name);
            System.exit(1);
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negative: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
