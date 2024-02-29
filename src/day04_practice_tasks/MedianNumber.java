package day04_practice_tasks;

public class MedianNumber {
    /*
    4. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 20;
        int c = 20;
        int median = 0;
        boolean aIsMedian = (a > b && a < c)||(a < b && a > c);
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        if (aIsMedian) {
            System.out.println(a + " is the median number");
        } else if (bIsMedian) {
            System.out.println(b + " is the median number");
        } else {
            System.out.println(c + " is the median number");
        }

    }

//        if (a != b && b != c && a != c) {
//            if (a > b && a > c) {
//                if (b > c) {
//                    median = b;
//                } else {
//                    median = c;
//                }
//            } else if (b > c && b > a) {
//                if (c > a) {
//                    median = c;
//                } else {
//                    median = a;
//                }
//            } else if (c > b && c > a) {
//                if (a > b) {
//                    median = a;
//                } else {
//                    median = b;
//                }
//            }
//            System.out.println(median + " is the median number");
//        } else {
//            System.out.println("There's no median number");
//
//
//        }
//
//    }

}


//        if (a > b && a > c) {
//
//            if (b > c) {
//                median = b;
//            } else {
//                median = c;
//            }
//        } else if (b > a && b > c) {
//            if (a > c) {
//                median = a;
//            } else {
//                median = c;
//            }
//        } else if (c > b && c > a) {
//            if (b > a) {
//                median = b;
//            } else {
//                median = a;
//            }
//        } else {
//
//            System.out.println("There's no median number");
//
//        }

