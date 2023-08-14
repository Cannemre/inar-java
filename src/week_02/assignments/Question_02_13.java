package week_02.assignments;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        double month1 = amount * (1 + 0.00417);
        double month2 = (amount + month1) * (1 + 0.00417);
        double month3 = (amount + month2) * (1 + 0.00417);
        double month4 = (amount + month3) * (1 + 0.00417);
        double month5 = (amount + month4) * (1 + 0.00417);
        double month6 = (amount + month5) * (1 + 0.00417);
        System.out.println(" After the sixth month, the account value is: " + (int)(month6 * 100) / 100.0);


    }
}
