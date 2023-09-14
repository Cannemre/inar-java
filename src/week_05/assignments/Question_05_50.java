package week_05.assignments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uppercaseCounter = 0;
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                uppercaseCounter++;
            }
        }
        System.out.println("The number of uppercase letters is " + uppercaseCounter);
    }
}
