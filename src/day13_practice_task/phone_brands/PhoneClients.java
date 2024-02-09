package day13_practice_task.phone_brands;

public class PhoneClients {
    public static void main(String[] args) {
        Nokia nokia = new Nokia("Nokia","3310","normal",67,"blue");
        System.out.println(nokia);
        nokia.call("3124718023");
        nokia.text("3124718023");
        nokia.faceTime("3124718023");

        Samsung samsung = new Samsung("Samsung","S6310","5G",87,"white");
        System.out.println(samsung);
        samsung.call("3124718023");
        samsung.text("3124718023");
        samsung.faceTime("3124718023");

        IPhone iPhone = new IPhone("Apple","Iphone 12","7G",900,"purple");
        System.out.println(iPhone);
        iPhone.call("3124718023");
        iPhone.text("3124718023");
        iPhone.faceTime("3124718023");


    }
}
