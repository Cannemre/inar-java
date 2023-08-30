package week_04.assignments;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in dollars and cents: ");
        String amount = input.nextLine();
        double money = Double.parseDouble(amount);
        int amountInt = (int)(money * 100);
        int numberOfDollars = amountInt / 100;
        int remainingAmount = amountInt % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        System.out.printf("Dollars: %d\nQuarters: %d\nDimes: %d\nNickels: %d\nPennies: %d", numberOfDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies);
    }
}
