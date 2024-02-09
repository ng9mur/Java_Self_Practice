package day12_practice_task;

import java.util.Collections;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {

        return name;
    }

    public double getUnitPrice() {

        return unitPrice;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank() ||
                (!Character.isLetter(name.charAt(0)))) {
            System.err.println("Invalid input/data for the name: " + name);
            System.exit(1);
        }

        char[] eachLetter = name.toCharArray();
        for(char each :eachLetter)

    {
        if (!Character.isLetterOrDigit(each) && !Character.isWhitespace(each)) {
            System.err.println("Invalid input/data for the name: " + name);
            System.exit(1);
        }
    }

            this.name =name;
}

        public void setUnitPrice ( double unitPrice){
            if (unitPrice < 0) {
                System.err.println("Unit price can not be negative: " + unitPrice);
                System.exit(1);
            }

            this.unitPrice = unitPrice;
        }

        public void setQuantity ( int quantity){
            if (quantity < 0) {
                System.err.println("Quantity can not be negative: " + quantity);
                System.exit(1);
            }
            this.quantity = quantity;
        }

        private double calcCost () {
            return unitPrice * quantity;
        }

        public String toString () {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", unitPrice=" + unitPrice +
                    ", quantity=" + quantity +
                    ", total cost=" + calcCost()+
                    '}';
        }
    }

