package week_03.assignments;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the amount (e.g 11.56): ");
        double amount = input.nextDouble();
        System.out.println(" Your amount " + amount + " consist of ");
        int numberOfDollars = (int) amount;
        int remainingAmount = (int) (amount * 100) % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        if (numberOfDollars > 1) {
            System.out.println(numberOfDollars + " dollars ");
        } else {
            System.out.println(amount + " dollar ");
        }
        if (numberOfQuarters > 1) {
            System.out.println(numberOfQuarters + " quarters ");
        } else {
            System.out.println(numberOfQuarters + " quarter ");
        }
        if (numberOfDimes > 1) {
            System.out.println(numberOfDimes + " dimes ");
        } else {
            System.out.println(numberOfDimes + " dime ");
        }
        if (numberOfNickels > 1) {
            System.out.println(numberOfNickels + " nickels ");
        } else {
            System.out.println(numberOfNickels + " nickel ");
        }
        if (numberOfPennies > 1) {
            System.out.println(numberOfPennies + " pennies ");
        } else {
            System.out.println(numberOfPennies + " penny ");
        }

    }
}
