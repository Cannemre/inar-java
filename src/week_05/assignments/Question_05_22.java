package week_05.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double interest;
        double monthlyPayment = amount * monthlyInterestRate / (1 - Math.pow((1 + monthlyInterestRate), years * - 12));
        double principal;
        System.out.println("Monthly Payment: " + Math.round(monthlyPayment));
        System.out.println("Total Payment: " + Math.round(monthlyPayment * 12));
        System.out.println();
        System.out.println("Payment#        Interest        Principal       Balance");
        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyInterestRate * amount;
            principal = monthlyPayment - interest;
            amount -= principal;
            System.out.println(i + "\t\t\t\t" + Math.round(interest) + "\t\t\t\t" + Math.round(principal) + "\t\t\t\t" + Math.round(amount));

        }

    }
}
