package week_04.assignments;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.nextLine();
        char ch1 = isbn.charAt(0);
        char ch2 = isbn.charAt(1);
        char ch3 = isbn.charAt(2);
        char ch4 = isbn.charAt(3);
        char ch5 = isbn.charAt(4);
        char ch6 = isbn.charAt(5);
        char ch7 = isbn.charAt(6);
        char ch8 = isbn.charAt(7);
        char ch9 = isbn.charAt(8);
        int digit1 = ch1 - '0';
        int digit2 = ch2 - '0';
        int digit3 = ch3 - '0';
        int digit4 = ch4 - '0';
        int digit5 = ch5 - '0';
        int digit6 = ch6 - '0';
        int digit7 = ch7 - '0';
        int digit8 = ch8 - '0';
        int digit9 = ch9 - '0';
        int digit10 = (digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
        if (digit10 == 10) {
            System.out.println(" The ISBN-10 number is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9 + "X");
        } else {
            System.out.println(" The ISBN-10 number is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9 + digit10);
        }
    }
}

