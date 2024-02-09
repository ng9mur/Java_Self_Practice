package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemName = "Tomato";
        item1.quantity = 5;
        item1.unitPrice = 2.67;
        double totalPrice = item1.calcCost(item1.unitPrice, item1.quantity);
        System.out.println(item1);
        System.out.println("totalPrice = " + totalPrice);

        System.out.println("-------------------------------------");

        Item item2 = new Item();
        item2.itemName = "Avocado";
        item2.quantity = 10;
        item2.unitPrice = 2.5;
        System.out.println("totalPrice = " + item2.calcCost(item2.unitPrice, item2.quantity));
        System.out.println(item2);
    }

}

