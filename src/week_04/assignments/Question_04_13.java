package week_04.assignments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
        String letterInput = input.nextLine();
        char letter = letterInput.charAt(0);
        switch (letter) {
            case 'A', 'a', 'E', 'e', 'U', 'u', 'O', 'o', 'I', 'i': System.out.println(letterInput + " is a vowel"); break;
            case 'Q', 'q', 'W', 'w', 'R', 'r', 'T', 't', 'Y', 'y', 'P', 'p', 'S', 's', 'D', 'd', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j', 'K', 'k', 'L', 'l', 'Z', 'z', 'X', 'x', 'C', 'c', 'V', 'v', 'B', 'b', 'N', 'n', 'M', 'm':
                System.out.println(letterInput + " is a consonant"); break;
            default: System.out.println(letterInput + " is an invalid input");

        }
    }
}
