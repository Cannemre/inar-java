package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int index = 0;
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            boolean result = true;
            int number = input.nextInt();
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
        System.out.println("The number of distinct numbers is " + index);
        System.out.print("The distinct numbers are ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
