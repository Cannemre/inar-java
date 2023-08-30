package week_04.assignments;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character:");
        String characterx = input.nextLine();
        char character = characterx.charAt(0);
        int ascii = (int)(character);
        System.out.println("The Unicode for the character " + characterx + " is " + ascii);
    }
}
