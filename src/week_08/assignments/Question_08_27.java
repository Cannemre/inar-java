package week_08.assignments;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.print("Enter 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("The column-sorted array is:");
        displayArray(sortRows(matrix));
    }

    public static void displayArray(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%7.3f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] array) {
        int a = 0;
        while (a < array[0].length) {
            for (int i = 0; i < array.length - 1; i++) {
                double currentMin = array[i][a];
                int currentMinIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (currentMin > array[j][a]) {
                        currentMin = array[j][a];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i) {
                    array[currentMinIndex][a] = array[i][a];
                    array[i][a] = currentMin;
                }
            }
            a++;
        }
        return array;
    }
}

