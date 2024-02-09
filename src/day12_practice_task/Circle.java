package day12_practice_task;

public class Circle {
    private double radius;


    Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius(){

        return radius;
    }

    public void setRadius(double radius){
        if (radius <=0){
            System.err.println("The radius cannot be set to a negative or zero value: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    private double calcArea(){

        return Math.PI * radius *radius;
    }

    private double calcPerimeter(){
        return 2* Math.PI * radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
