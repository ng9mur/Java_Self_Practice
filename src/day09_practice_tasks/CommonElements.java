package day09_practice_tasks;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 =  {1,2,3,4,5,7,9,3,0};
        int[] arr2 = {5,7,8,77,6,9,-1};

        findCommonElements(arr2,arr1);
    }

    private static void findCommonElements(int[] arr2, int[] arr1) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);

                }
            }
        }
    }
}
