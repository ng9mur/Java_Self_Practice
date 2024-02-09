package day01_practice_tasks;

public class Triangle {
    /*
    Create a Java class named Triangle that prints the following outputs in the console:

	                    ^
	                   / \
	                  /   \
	                 /     \
	                /       \
	                ---------
     */
    public static void main(String[] args) {
        System.out.println("    ^    ");
        System.out.println("   / \\  ");
        System.out.println("  /   \\ ");
        System.out.println(" /     \\");
        System.out.println("/       \\");
        System.out.println("---------");


            long a = 3_000L;
            double b = (float) a;
            int c = (short) b;
            System.out.println(c % 1000);


    }
}
