package week_06.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String passwordTry = input.nextLine();
        if (isValid(passwordTry)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean isValid (String password) {
        int digitCounter = 0;
        boolean result = true;
        char firsDigit = '0';
        char lastDigit = '9';
        char firsLetterUpper = 'A';
        char lastLetterUpper = 'Z';
        char firsLetter = 'a';
        char lastLetter = 'z';
        if (password.length() < 8) {
            result = false;
        }
        for (int i = 0; i <= password.length() - 1; i++) {
            if (!((firsDigit <= password.charAt(i) && password.charAt(i) <= lastDigit) || (firsLetterUpper <= password.charAt(i) && password.charAt(i) <= lastLetterUpper) || (firsLetter <= password.charAt(i) && password.charAt(i) <= lastLetter))) {
                result = false;
                break;
            }
        }
        for (int i = 0; i <= password.length() - 1; i++) {
            if (firsDigit <= password.charAt(i) && password.charAt(i) <= lastDigit) {
                digitCounter++;
            }
        }
        if (digitCounter < 2) {
            result = false;
        }
        return result;
    }
}
