package day11_practice_task;

public class PizzaClients {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Small", 2, 3);
        System.out.println(pizza1);


        Pizza pizza2 = new Pizza("Medium", 5, 5);
        System.out.println(pizza2);

        Pizza pizza3 = new Pizza("Large", 10, 15);
        System.out.println(pizza3);

        Pizza pizza4 = new Pizza("Big", -2, 0);
        System.out.println(pizza4);

        Pizza pizza5 = new Pizza("Large", 1, 3);
        System.out.println(pizza5);
    }
}
