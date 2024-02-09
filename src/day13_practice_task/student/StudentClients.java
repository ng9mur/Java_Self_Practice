package day13_practice_task.student;

public class StudentClients {
    public static void main(String[] args) {
        GraduateStudent graduateStudent = new GraduateStudent("Jake", 23, "male","11","SDET",'A',"Cydeo");
        System.out.println(graduateStudent);
        graduateStudent.study();

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Mel", 25, "female","12","SDET",'B',"Cydeo");
        System.out.println(undergraduateStudent);
        undergraduateStudent.study();


        CydeoStudent cydeoStudent = new CydeoStudent("Rob",33,"male","13","SDET",'C',"Cydeo",9,45,"Python");
        System.out.println(cydeoStudent);
        cydeoStudent.study();
    }
}
