package week_12.assignments.Question_12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers to sum: ");
        boolean continueInput = true;
        while (continueInput) {
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.printf("Sum of %d + %d is %d", a, b, a + b);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.print("Wrong input!! Please enter integer --> ");
                input.nextLine();
            }
        }
    }
}
