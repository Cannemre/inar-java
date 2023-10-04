package week_07.assignments;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The greatest common divisor is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        int gcd = minNumber(numbers) / 2;
        if (gcd == 0) {
            return 0;
        }
        for (int i = 0; i < numbers.length; ) {
            if (numbers[i] % gcd == 0) {
                i++;
            } else {
                gcd--;
                i = 0;
            }
        }
        return gcd;
    }

    public static int minNumber(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
