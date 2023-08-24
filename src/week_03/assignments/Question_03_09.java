package week_03.assignments;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();
        int digit4 = input.nextInt();
        int digit5 = input.nextInt();
        int digit6 = input.nextInt();
        int digit7 = input.nextInt();
        int digit8 = input.nextInt();
        int digit9 = input.nextInt();
        int digit10 = (digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
        if (digit10 == 10) {
            System.out.println(" The ISBN-10 number is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9 + "X");
        } else {
            System.out.println(" The ISBN-10 number is "  + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9 + digit10);
        }
    }
}

