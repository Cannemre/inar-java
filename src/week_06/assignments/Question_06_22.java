package week_06.assignments;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.println("The approximated square root of " + number + " is: " + sqrt(number));
    }
    public static double sqrt (long n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        while (Math.abs(lastGuess - nextGuess) >= 0.0001) {
            nextGuess = lastGuess;
            lastGuess = (lastGuess + n / lastGuess) / 2;
        }
        return Math.round(nextGuess);
    }
}
