package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.buildingNumber = 1600;
        address1.street = "Pennsylvania Avenue";
        address1.city = "Washington";
        address1.state = "DC";
        address1.zipCode = "20500";

        System.out.println(address1);

        System.out.println("-------------------------");

        Address address2 = new Address();
        address2.buildingNumber = 129;
        address2.street = "West 81st St.";
        address2.city = "New York";
        address2.state = "NY";
        address2.zipCode = "10024";

        System.out.println(address2);
    }
}
