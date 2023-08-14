package week_02.assignments;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter an amount as integer, for example 1156 for 11.56: ");
        int amount = input.nextInt();
        int numberOfDollars = amount / 100;
        int remainingAmount = amount % 100;
        int numberofQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + " consist of \n" + numberOfDollars + " dollars \n" +
                numberofQuarters + " quarters \n" + numberOfDimes + " dimes \n" + numberOfNickels + " nickels \n" +
                numberOfPennies + " pennies");


    }
}
