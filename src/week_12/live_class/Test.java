package week_12.live_class;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("Exception: an integer cannot be divided by zero ");
        }
        System.out.println("Execution continues ...");
    }
    public static int quotient(int n, int m) throws ArithmeticException {
        if (m == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return n / m;
    }
}
