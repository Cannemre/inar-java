package week_07.assignments;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(reverse(numbers)[i] + " ");
        }
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reverse[j] = array[i];
        }
        return reverse;
    }
}
