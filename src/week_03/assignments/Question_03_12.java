package week_03.assignments;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a three-digit integer: ");
        int number = input.nextInt();
        int digit1 = number / 100;
        int digit3 = number % 10;
        if (100 > number || number > 999) {
            System.out.println(" Invalid integer ! ");
            System.exit(1);
        }
        if (digit1 == digit3) {
            System.out.println(number + " is palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
