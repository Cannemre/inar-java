package week_05.assignments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn9 = input.nextInt();
        int isbnOriginal = isbn9;
        int digit;
        int formula = 0;
        for (int i = 9; i > 1 ; i--) {
            digit = isbn9 % 10;
            formula += digit * i;
            isbn9 /= 10;
        }
        if (formula % 11 == 10) {
            System.out.println("The ISBN-10 number is 0" + isbnOriginal + "X");
        } else {
            System.out.println("The ISBN-10 number is 0" + isbnOriginal + formula % 11);
        }
    }
}
