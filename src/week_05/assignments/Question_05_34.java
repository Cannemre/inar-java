package week_05.assignments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uiWinCount = 0;
        int userWinCount = 0;
        int i = 3;
        while (i != userWinCount - uiWinCount) {
            System.out.print(" scissors (0), rock (1), paper (2): ");
            int guess = input.nextInt();
            int pcGuess = (int) (Math.random() * 3);
            if (guess == 0) {
                if (pcGuess == 0) {
                    System.out.println(" The computer is scissors. You are scissors too. It is a draw");
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                } else if (pcGuess == 1) {
                    System.out.println(" The computer is rock. You are scissors. You lost");
                    uiWinCount++;
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                } else if (pcGuess == 2) {
                    System.out.println(" The computer is paper. You are scissors. You won");
                    userWinCount++;
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                }
            }
            if (guess == 1) {
                if (pcGuess == 0) {
                    System.out.println(" The computer is scissors. You are rock. You won");
                    userWinCount++;
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                } else if (pcGuess == 1) {
                    System.out.println(" The computer is rock. You are rock too. It is a draw");
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                } else if (pcGuess == 2) {
                    System.out.println(" The computer is paper. You are rock. You lost");
                    uiWinCount++;
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                }
            }
            if (guess == 2) {
                if (pcGuess == 0) {
                    System.out.println(" The computer is scissors. You are paper. You lost");
                    uiWinCount++;
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                } else if (pcGuess == 1) {
                    System.out.println(" The computer is rock. You are paper. You won");
                    userWinCount++;
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                } else if (pcGuess == 2) {
                    System.out.println(" The computer is paper. You are paper too. It is a draw");
                    System.out.println(" Computer wins: " + uiWinCount);
                    System.out.println(" User wins: " + userWinCount);
                }
            }
            if (uiWinCount - userWinCount == 3) {
                break;
            }
        }
        if (uiWinCount > userWinCount) {
            System.out.println(" Game Over! You Lost!");
        } else {
            System.out.println(" Game Over! You Win!");
        }
    }
}
