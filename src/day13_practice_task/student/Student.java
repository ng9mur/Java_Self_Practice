package day13_practice_task.student;

public class Student {

    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank() ){
            System.err.println("Name can not be null: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            System.err.println("Age can not be less than 18" + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        if (gender == null || gender.isEmpty() || gender.isBlank() ){
            System.err.println("Gender can not be null: " + gender);
            System.exit(1);
        }
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'';
    }
}
