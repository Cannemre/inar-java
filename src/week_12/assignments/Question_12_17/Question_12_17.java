package week_12.assignments.Question_12_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_17 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter wordlist file pathname for Hangman game: ");
        String pathname = input.nextLine();
        File hangman = new File(pathname);
        Scanner scanner = new Scanner(hangman);
        String answer = "y";
        while (answer.equals("y")) {
            String word = scanner.nextLine();
            String[] wordChar = new String[word.length()];
            String[] wordGuess = new String[wordChar.length];
            for (int i = 0; i < wordChar.length; i++) {
                wordChar[i] = word.charAt(i) + "";
            }
            Arrays.fill(wordGuess, "*");
            int counter = 0;
            boolean result = false;
            while (!result) {
                System.out.print("(Guess) Enter a letter in word ");
                for (String s : wordGuess) {
                    System.out.print(s);
                }
                System.out.print(" > ");
                String guess = input.next();
                boolean check = false;
                for (int i = 0; i < wordChar.length; i++) {
                    if (wordChar[i].equals(guess)) {
                        if (!wordGuess[i].equals(guess)) {
                            wordGuess[i] = guess;
                        } else {
                            System.out.println("\tGuess is already in the word");
                        }
                        check = true;
                    }
                }
                if (!check) {
                    System.out.println("\tGuess is not in the word");
                    counter++;
                }
                boolean control = false;
                for (int i = 0; i < wordGuess.length; i++) {
                    control = false;
                    if (wordGuess[i].equals(wordChar[i])) {
                        control = true;
                    } else {
                        break;
                    }
                }
                if (control) {
                    result = true;
                }
            }
            System.out.print("The word is ");
            for (String s : wordChar) {
                System.out.print(s);
            }
            System.out.print(". You missed " + counter + " time");
            System.out.println();
            System.out.print("Do you want to guess another word? Enter y or n > ");
            answer = input.next();
        }
    }
}
