package day09_practice_tasks;

public class Items {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int index = 0;
        boolean isIpadPresent = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equals("iPad")) {
                isIpadPresent = true;
                System.out.println(isIpadPresent);

            }
            if (items[i].equals("Gloves")) {
                index = i;

                System.out.println(index);


            }


        }
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + " - #" + itemIDs[i]);
        }


    }
}
