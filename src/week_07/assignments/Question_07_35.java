package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"fabricio", "neck", "pepe", "marcelo", "adriano", "hutchinson", "maestro", "anderson", "ricardo", "babel", "cenk"};
        String answer = "y";
        while (answer.equals("y")) {
            int wordNumber = (int) (Math.random() * 12);
            String word = words[wordNumber];
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
