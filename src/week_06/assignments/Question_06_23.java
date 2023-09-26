package week_06.assignments;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a character that you want to count: ");
        String ch = input.next();
        System.out.println(count(s, ch.charAt(0)));
    }

    public static int count(String str, char a) {
        int counter = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == a) {
                counter++;
            }
        }
        return counter;
    }
}
