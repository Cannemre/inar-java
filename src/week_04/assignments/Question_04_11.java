package week_04.assignments;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15):");
        int decimalValue = input.nextInt();
        if (decimalValue < 10 && decimalValue > 0) {
            System.out.println("The hex value is " + decimalValue);
        } else if (decimalValue > 15 || decimalValue < 0) {
            System.out.println(decimalValue + " is an invalid input");
        }
        switch (decimalValue) {
            case 10: System.out.println("The hex value is A"); break;
            case 11: System.out.println("The hex value is B"); break;
            case 12: System.out.println("The hex value is C"); break;
            case 13: System.out.println("The hex value is D"); break;
            case 14: System.out.println("The hex value is E"); break;
            case 15: System.out.println("The hex value is F"); break;
        }
    }
}
