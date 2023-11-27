package week_12.assignments.Question_12_08;

import java.util.Scanner;

public class Question_12_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (hexChar >= 'A' && hexChar <= 'F' || Character.isDigit(hexChar)) {
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            } else {
                throw new NumberFormatException("It is not a hex string.!");
            }
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}
