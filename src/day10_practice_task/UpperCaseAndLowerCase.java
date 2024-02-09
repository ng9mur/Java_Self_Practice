package day10_practice_task;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAaVA jaja  vVAAa";
        char[] ch = str.toCharArray();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])){
                lowerCaseCount+=1;
            }else if(Character.isUpperCase(ch[i])){
                upperCaseCount+=1;
            }
        }
        System.out.println(upperCaseCount == lowerCaseCount);
    }
}
