package week_12.assignments.Question_12_09;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) throws BinaryFormatException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = input.nextLine();
        System.out.println("The decimal value for binary number " + binaryNumber + " is " + bin2dec(binaryNumber));
    }
    public static int bin2dec(String binaryString) throws BinaryFormatException{
        int result = 0;
        int num = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(binaryString.charAt(i) + "");
            if (digit <= 1 && binaryString.length() < 12) {
                result += (int) (Math.pow(2, num) * digit);
            } else {
                throw new BinaryFormatException();
            }
            num++;
        }
        return result;
    }
}
