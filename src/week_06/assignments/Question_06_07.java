package week_06.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double interest = input.nextDouble();
        System.out.print("Enter how many years to calculate: ");
        int year = input.nextInt();
        System.out.println("Years Future Value");
        System.out.println(futureInvestmentValue(amount, interest, year));
    }

    public static double futureInvestmentValue(double x, double y, int z) {
        double total = 0;
        for (int i = 1; i <= z; i++) {
            total = x * Math.pow((1 + y / 100 / 12), i * 12);
            System.out.printf("%d        %.2f", i, total);
            System.out.println();
        }
        return total;
    }
}
