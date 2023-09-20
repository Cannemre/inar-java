package week_06.assignments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        long number = input.nextLong();
        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }
    public static long sumDigits (long n) {
        long total = 0;
        long digit;
        while (n != 0) {
            digit = n % 10;
            total += digit;
            n /= 10;
        }
        return total;
    }
}
