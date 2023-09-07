package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int numberTemp;
        if (number1 > number2) {
            numberTemp = number2;
            number2 = number1;
            number1 = numberTemp;
        }
        int greatestCommonDivisor = 1;
        int divisor = 2;
        while (divisor <= number1) {
            if (number1 % divisor == 0 && number2 % divisor == 0) {
                greatestCommonDivisor = divisor;
            }
            divisor++;
        }
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " +greatestCommonDivisor);
    }
}
