package week_05.assignments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two distinct digits): ");
        int guess = input.nextInt();
        int lotteryNumber = 0;
        int digit1 = 1;
        int digit2 = 1;
        while (digit1 == digit2) {
            lotteryNumber = (int) (Math.random() * 1000) + 100;
            lotteryNumber %= 100;
            digit1 = lotteryNumber / 10;
            digit2 = lotteryNumber % 10;
        }
        System.out.println("The lottery number is " + lotteryNumber);
        if (guess == lotteryNumber) {
            System.out.println("Exact match! You win $10,000");
        } else if (guess / 10 == digit1 || guess % 10 == digit2) {
            System.out.println("Match one digit! You win $1,000");
        } else if (guess / 10 == digit2 && guess % 10 == digit1) {
            System.out.println("Match all digits! You win $3,000");
        } else {
            System.out.println("Sorry no match :(");
        }
    }
}

