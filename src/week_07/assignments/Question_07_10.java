package week_07.assignments;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The minimum number is " + Question_07_09.min(numbers) + " index " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
