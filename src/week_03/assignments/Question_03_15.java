package week_03.assignments;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your lottery pick (three digits): ");
        int guess = input.nextInt();
        int number = (int) (Math.random() * 1000);
        System.out.println(number);
        int guessDigit1 = (guess % 100) % 10;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit3 = guess / 100;
        int numberDigit1 = (number % 100) % 10;
        int numberDigit2 = (number / 10) % 10;
        int numberDigit3 = number / 100;
        if (guess == number) {
            System.out.println(" Exact match !!! $10,000 Prize !!!");
        }
        if (guessDigit1 == numberDigit1) {
            if (guessDigit2 == numberDigit3) {
                if (guessDigit3 == numberDigit2) {
                    System.out.println(" Match all digits !!! 3,000 Prize !!!");
                }
            }
        }
        if (guessDigit1 == numberDigit2) {
            if (guessDigit2 == numberDigit3) {
                if (guessDigit3 == numberDigit1) {
                    System.out.println(" Match all digits !!! 3,000 Prize !!!");
                }
            }
        }
        if (guessDigit1 == numberDigit2) {
            if (guessDigit2 == numberDigit1) {
                if (guessDigit3 == numberDigit3) {
                    System.out.println(" Match all digits !!! 3,000 Prize !!!");
                }
            }
        }
        if (guessDigit1 == numberDigit3) {
            if (guessDigit2 == numberDigit2) {
                if (guessDigit3 == numberDigit1) {
                    System.out.println(" Match all digits !!! 3,000 Prize !!!");
                }
            }
        }
        if (guessDigit1 == numberDigit3) {
            if (guessDigit2 == numberDigit1) {
                if (guessDigit3 == numberDigit2) {
                    System.out.println(" Match all digits !!! 3,000 Prize !!!");
                }
            }
        }
        if (guessDigit1 == numberDigit1 || guessDigit1 == numberDigit2 || guessDigit1 == numberDigit3) {
            System.out.println(" Matches a digit !!! $1,000");
        } else if (guessDigit2 == numberDigit1 || guessDigit2 == numberDigit2 || guessDigit2 == numberDigit3) {
            System.out.println(" Matches a digit !!! $1,000");
        } else if (guessDigit3 == numberDigit1 || guessDigit3 == numberDigit2 || guessDigit3 == numberDigit3) {
            System.out.println(" Matches a digit !!! $1,000");
        } else {
            System.out.println(" Sorry no match :( ");
        }
    }
}