package week_07.assignments;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < newLength(numbers); i++) {
            System.out.print(eliminateDuplicates(numbers)[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] numbers) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean result = true;
            int number = numbers[i];
            for (int j = index - 1; j >= 0; j--) {
                if (numbers[j] == number) {
                    result = false;
                    break;
                }
            }
            if (result) {
                numbers[index] = number;
                index++;
            }
        }
        return numbers;
    }

    public static int newLength(int[] numbers) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean result = true;
            int number = numbers[i];
            for (int j = index - 1; j >= 0; j--) {
                if (numbers[j] == number) {
                    result = false;
                    break;
                }
            }
            if (result) {
                numbers[index] = number;
                index++;
            }
        }
        return index;
    }
}
