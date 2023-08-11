package week_02.assignments;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total;
        System.out.println(" Enter a number between 0 and 1000: ");
        number = input.nextInt();
        total = (number / 100) + ((number / 10) % 10) + (number % 10);
        System.out.println(" The sum of the digits is " + total);

    }
}
