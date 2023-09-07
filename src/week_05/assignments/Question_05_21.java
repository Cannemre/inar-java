package week_05.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monthlyPayment;
        double totalPayment;
        System.out.print("Loan Amount: ");
        int amount = input.nextInt();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Interest Rate     Monthly Payment     Total Payment");
        for (double i = 5; i <= 8;) {
            monthlyPayment = (amount * (i / 100)) / (1 - (1 / (Math.pow((1 + (i / 100)), numberOfYears * 12))));
            totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%.3f             %.2f              %.2f", i, monthlyPayment, totalPayment);
            i += 0.125;
            System.out.println();
        }
    }
}
