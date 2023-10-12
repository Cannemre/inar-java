package week_07.assignments;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        bubbleSort(numbers);
        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSort(double[] array) {
        boolean result = true;
        while (result) {
            result = false;
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    break;
                }
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    result = true;
                }
            }
        }
    }
}
