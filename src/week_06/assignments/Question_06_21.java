package week_06.assignments;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String phoneNumber = input.nextLine();
        String correctPhoneNumber = "";
        phoneNumber = phoneNumber.toUpperCase();
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (Character.isLetter(phoneNumber.charAt(i))) {
                correctPhoneNumber += getNumber(phoneNumber.charAt(i));
            } else {
                correctPhoneNumber += phoneNumber.charAt(i);
            }
        }
        System.out.println(correctPhoneNumber);
    }

    public static char getNumber(char uppercaseLetter) {
        if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
            return '2';
        } else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
            return '3';
        } else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
            return '4';
        } else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
            return '5';
        } else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
            return '6';
        } else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S') {
            return '7';
        } else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
            return '8';
        } else {
            return '9';
        }
    }
}
