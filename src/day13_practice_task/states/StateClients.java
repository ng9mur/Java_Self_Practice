package day13_practice_task.states;

public class StateClients {
    public static void main(String[] args) {
        California california = new California("California","CA","Democratic Party","Gavin Newsom ","Alex Padilla",38_900_000);
        Virginia virginia  = new Virginia("Virginia","VA","Republican Party","Glenn Youngkin","Mark Warner",8_642_000);
        Texas texas = new Texas("Texas","TX","Republican Party","Greg Abbott","Ted Cruz",29_530_000);
        Florida florida = new Florida("Florida","FL","Republican Party","Ron DeSantis","Rick Scott",21_780_000);

        System.out.println(california);
        System.out.println(virginia);
        System.out.println(texas);
        System.out.println(florida);



    }
}
