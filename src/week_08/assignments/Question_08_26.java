package week_08.assignments;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.print("Enter 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("The row-sorted array is");
        displayArray(sortRows(matrix));
    }

    public static void displayArray(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] array) {
        int a = 0;
        while (a < array.length) {
            for (int i = 0; i < array[0].length - 1; i++) {
                double currentMin = array[a][i];
                int currentMinIndex = i;
                for (int j = i + 1; j < array[0].length; j++) {
                    if (currentMin > array[a][j]) {
                        currentMin = array[a][j];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i) {
                    array[a][currentMinIndex] = array[a][i];
                    array[a][i] = currentMin;
                }
            }
            a++;
        }
        return array;
    }
}
