package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemName = "Tomato";
        item1.quantity = 5;
        item1.unitPrice = 2.67;
        System.out.println(item1);


        System.out.println("-------------------------------------");

        Item item2 = new Item();
        item2.itemName = "Avocado";
        item2.quantity = 10;
        item2.unitPrice = 2.5;
        System.out.println(item2);
    }

}

