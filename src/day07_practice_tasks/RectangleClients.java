package day07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 5.5;
        rectangle1.length = 7.5;

        System.out.println(rectangle1);
        System.out.println("rectangle1 area = " + rectangle1.calculateArea());
        System.out.println("rectangle1 perimeter = " + rectangle1.calculatePerimeter());


        System.out.println("------------------------");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 4.5;
        rectangle2.length = 8;

        System.out.println(rectangle2);
        System.out.println("rectangle2 area = " + rectangle2.calculateArea());
        System.out.println("rectangle2 area " + rectangle2.calculatePerimeter());


            


    }
}
