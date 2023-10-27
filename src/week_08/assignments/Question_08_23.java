package week_08.assignments;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        System.out.println("Enter a 6-by-6 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.printf("The flipped cell is at (%d, %d)", row(matrix), column(matrix));
    }

    public static int row(int[][] matrix) {
        int result = 0;
        for (int i = 1; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                result = i;
            }
        }
        return result;
    }

    public static int column(int[][] matrix) {
        int result = 0;
        for (int i = 1; i < matrix[0].length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                result = i;
            }
        }
        return result;
    }
}
