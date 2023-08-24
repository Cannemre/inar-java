package week_03.assignments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" scissors (0), rock (1), paper (2): ");
        int guess = input.nextInt();
        int pcGuess = (int) (Math.random() * 3);
        if (guess == 0) {
            if (pcGuess == 0) {
                System.out.println(" The computer is scissors. You are scissors too. It is a draw");
            } else if (pcGuess == 1) {
                System.out.println(" The computer is rock. You are scissors. You lost");
            } else if (pcGuess == 2) {
                System.out.println(" The computer is paper. You are scissors. You won");
            }
        } if (guess == 1) {
            if (pcGuess == 0) {
                System.out.println(" The computer is scissors. You are rock. You won");
            } else if (pcGuess == 1) {
                System.out.println(" The computer is rock. You are rock too. It is a draw");
            } else if (pcGuess == 2) {
                System.out.println(" The computer is paper. You are rock. You lost");
            }
        } if (guess == 2) {
            if (pcGuess == 0) {
                System.out.println(" The computer is scissors. You are paper. You lost");
            } else if (pcGuess == 1) {
                System.out.println(" The computer is rock. You are paper. You won");
            } else if (pcGuess == 2) {
                System.out.println(" The computer is paper. You are paper too. It is a draw");
            }
        }
    }
}
