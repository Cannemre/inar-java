package week_04.assignments;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();
        char letterCh = letter.charAt(0);
        switch (letterCh) {
            case '_', ',', '@': System.out.println("The corresponding number is 1"); break;
            case 'A', 'B', 'C', 'a', 'b', 'c': System.out.println("The corresponding number is 2"); break;
            case 'D', 'E', 'F', 'd', 'e', 'f': System.out.println("The corresponding number is 3"); break;
            case 'G', 'H', 'I', 'g', 'h', 'i': System.out.println("The corresponding number is 4"); break;
            case 'J', 'K', 'L', 'j', 'k', 'l': System.out.println("The corresponding number is 5"); break;
            case 'M', 'N', 'O', 'm', 'n', 'o': System.out.println("The corresponding number is 6"); break;
            case 'P', 'Q', 'R', 'S', 'p', 'q', 'r', 's': System.out.println("The corresponding number is 7"); break;
            case 'T', 'U', 'V', 't', 'u', 'v': System.out.println("The corresponding number is 8"); break;
            case 'W', 'X', 'Y', 'Z', 'w', 'x', 'y', 'z': System.out.println("The corresponding number is 9"); break;
            case ' ': System.out.println("The corresponding number is *"); break;
            default: System.out.println(letterCh+ " is an invalid input");
        }
    }
}
