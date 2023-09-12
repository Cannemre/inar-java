package week_05.assignments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double interestRate = input.nextDouble();
        interestRate = (interestRate / 100) / 12;
        System.out.print("Enter the number of months (e.g., 6): ");
        int months = input.nextInt();
        double result = 0;
        for (int i = 1; i <= months; i++) {
            result = (amount + result) * (1 + interestRate);
        }
        System.out.printf("Amount in savings account after %d months: $%.2f", months, result);
    }
}
