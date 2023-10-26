package week_08.assignments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            if (i == 1) {
                System.out.print(" + ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < sumMatrix(matrix1, matrix2).length; j++) {
                System.out.printf("%1.1f ", sumMatrix(matrix1, matrix2)[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] sumMatrix(double[][] a, double[][] b) {
        double[][] sum = new double[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}

