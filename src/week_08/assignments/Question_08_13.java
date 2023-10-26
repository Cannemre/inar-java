package week_08.assignments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.print("Enter the array: ");
        double[][] numbers = new double[row][column];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = input.nextDouble();
            }
        }
        System.out.printf("The location of the largest element is at (%d, %d)", locateLargest(numbers)[0], locateLargest(numbers)[1]);
    }

    public static int[] locateLargest(double[][] a) {
        int[] largestNumbers = new int[2];
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == max) {
                    largestNumbers[0] = i;
                    largestNumbers[1] = j;
                    break;
                }
            }
        }
        return largestNumbers;
    }
}
