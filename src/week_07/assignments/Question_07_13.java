package week_07.assignments;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers to exclude from random (1-54): ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Number generated: " + getRandom(numbers));
    }

    public static int getRandom(int... numbers) {
        int number = 0;
        boolean result = false;
        while (!result) {
            number = (int) ((Math.random() * 54) + 1);
            for (int j : numbers) {
                result = false;
                if (j != number) {
                    result = true;
                }
            }
        }
        return number;
    }
}
