package week_05.assignments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i+=2) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}
