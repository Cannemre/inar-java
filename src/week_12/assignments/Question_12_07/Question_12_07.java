package week_12.assignments.Question_12_07;

import java.util.Scanner;

public class Question_12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        try {
            String binaryNumber = input.nextLine();
            System.out.println("The decimal value for binary number " + binaryNumber + " is " + bin2dec(binaryNumber));
        } catch (NumberFormatException ex) {
            System.out.println("It is not a binary string.!");
        }

    }

    public static int bin2dec(String binaryString) {
        int result = 0;
        int num = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(binaryString.charAt(i) + "");
            if (digit <= 1 && binaryString.length() > 12) {
                result += (int) (Math.pow(2, num) * digit);
            } else {
                throw new NumberFormatException();
            }
            num++;
        }
        return result;
    }
}
