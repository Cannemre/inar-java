package week_05.assignments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int divisor = 2;
        while (divisor <= number) {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
                number /= divisor;
            }
            divisor++;
        }
    }
}
