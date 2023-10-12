package week_07.assignments;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int number : numbers) {
            for (int i : numbers) {
                if (number != i) {
                    System.out.print(number + " " + i);
                    System.out.println();
                }
            }
        }
    }
}
