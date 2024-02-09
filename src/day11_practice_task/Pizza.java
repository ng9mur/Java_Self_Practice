package day11_practice_task;

public class Pizza {
    public String size;
    public  double numberOfCheeseTopping;
    public double numberOfPepperoniTopping;


    public Pizza(String size, double numberOfCheeseTopping, double numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }

    public double calcCost(){
       int pizzaCost =0;
       switch (size){
           case "Small" -> pizzaCost = 10;
           case "Medium" -> pizzaCost = 12;
           case "Large" -> pizzaCost = 14;
       }

       double priceOfCheeseTopping = 2 * numberOfCheeseTopping;
       double priceOfPepperoniTopping = 2 * numberOfPepperoniTopping;

       return pizzaCost  + priceOfCheeseTopping + priceOfPepperoniTopping;
   }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost=" + calcCost() +
                '}';
    }
}
