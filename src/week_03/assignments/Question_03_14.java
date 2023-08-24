package week_03.assignments;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Guess the flip of coin (0 represent head and 1 represent tail): ");
        int guess = input.nextInt();
        if (guess != 0 && guess != 1) {
            System.out.println("Invalid guess !");
            System.exit(1);
        }
        int answer = (int) (Math.random() * 2);
        if (guess == answer) {
            System.out.println("Your guess is correct");
        } else {
            System.out.println("Your guess is incorrect");
        }
    }
}
