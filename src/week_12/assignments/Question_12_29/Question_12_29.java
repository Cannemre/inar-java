package week_12.assignments.Question_12_29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        File file = new File(System.getProperty("user.dir") + "/src/week_12/assignments/Question_12_29/" + scanner.next());
        if (!file.exists()) {
            System.out.println("File " + file.getName() + " does not exist");
            System.exit(0);
        }
        int[] count = new int[26];
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String line = (input.nextLine()).toUpperCase();
                countLetters(count, line);
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println("Number of " + (char) ('A' + i) + "'s: " + count[i]);
        }
    }

    public static void countLetters(int[] count, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count[(str.charAt(i) - 'A')]++;
        }
    }
}
