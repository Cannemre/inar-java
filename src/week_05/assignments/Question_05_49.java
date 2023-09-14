package week_05.assignments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vowels = 0;
        int consonants = 0;
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vowels++;
            } else if (str.charAt(i) != ' ') {
                consonants++;
            }
        }
        System.out.println("The number of vowels is " + vowels + "\nThe number of consonants is " + consonants);
    }
}
