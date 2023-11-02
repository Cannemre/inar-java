package week_09.assignments;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rowNumber = input.nextInt();
        int columnNumber = input.nextInt();
        double[][] array = new double[rowNumber][columnNumber];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        Location location = Location.locateLargest(array);
        System.out.printf("The location of the largest element is %.1f at (%d, %d)", location.maxValue, location.row, location.column);
    }
}
