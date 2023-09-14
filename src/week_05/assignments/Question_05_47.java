package week_05.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();
        if (isbn.length() != 12) {
            System.out.println("Invalid input !");
            System.exit(0);
        }
        int isbn13;
        int total = 0;
        for (int i = 0; i < isbn.length(); i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11) {
                total += 3 * Integer.parseInt(isbn.charAt(i) + "");
            } else {
                total += Integer.parseInt(isbn.charAt(i) + "");
            }
        }
        isbn13 = 10 - (total % 10);
        if (isbn13 == 10) {
            System.out.println("The ISBN-13 number is " + isbn + "0");
        } else {
            System.out.println("The ISBN-13 number is " + isbn + isbn13);
        }
    }
}
