package week_08.assignments;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.print("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] matrix) {
        if (!isPositive(matrix)) {
            return false;
        }
        return sumColumn(matrix) == 1;
    }

    public static boolean isPositive(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static double sumColumn(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum != 1) {
                break;
            }
        }
        return sum;
    }
}
