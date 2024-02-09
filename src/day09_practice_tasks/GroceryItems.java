package day09_practice_tasks;

public class GroceryItems {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (int i = 0; i < items.length; i++) {
            for (int i1 = 0; i1 < items[i].length; i1++) {
                System.out.print(items[i][i1] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("======================================================");

        for (int i = 0; i < items.length; i++) {
            for (int i1 = items[i].length - 1; i1 >= 0; i1--) {
                System.out.print(items[i][i1] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("======================================================");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < items[i].length; i1++) {
                System.out.print(items[i][i1] + "\t\t");
            }
            System.out.println();
        }

    }
}
