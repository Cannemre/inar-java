package week_02.assignments;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println(" Enter annual interest rate in percentage: ");
        double yearlyInterestRate = input.nextDouble();
        double monthlyInterestRate = yearlyInterestRate / 1200.0;
        System.out.println(" Enter number of years: ");
        double numberOfYears = input.nextDouble();
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.println(" Accumulated value is $" + (int)(futureInvestmentValue * 100) / 100.0);
    }
}
