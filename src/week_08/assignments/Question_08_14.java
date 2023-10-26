package week_08.assignments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        boolean result = false;
        boolean result2 = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result = false;
                if (matrix[i][j] == 0) {
                    result = true;
                } else {
                    break;
                }
            }
            if (result) {
                System.out.println("0s on row " + i);
                result2 = false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result = false;
                if (matrix[i][j] == 1) {
                    result = true;
                } else {
                    break;
                }
            }
            if (result) {
                System.out.println("1s on row " + i);
                result2 = false;
            }
        }
        if (result2) {
            System.out.println("No same numbers on a row");
        }
        result2 = true;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result = false;
                if (matrix[j][i] == 0) {
                    result = true;
                } else {
                    break;
                }
            }
            if (result) {
                System.out.println("0s on column " + i);
                result2 = false;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result = false;
                if (matrix[j][i] == 1) {
                    result = true;
                } else {
                    break;
                }
            }
            if (result) {
                System.out.println("1s on column " + i);
                result2 = false;
            }
        }
        if (result2) {
            System.out.println("No same numbers on a column");
        }
        result2 = true;
        for (int i = 0; i < matrix.length; i++) {
            result = false;
            if (matrix[i][i] == 0) {
                result = true;
            } else {
                break;
            }
        }
        if (result) {
            System.out.println("0s on major diagonal");
            result2 = false;
        }
        for (int i = 0; i < matrix.length; i++) {
            result = false;
            if (matrix[i][i] == 1) {
                result = true;
            } else {
                break;
            }
        }
        if (result) {
            System.out.println("1s on major diagonal");
            result2 = false;
        }
        if (result2) {
            System.out.println("No same numbers on the major diagonal");
        }
        result2 = true;
        int column = size - 1;
        for (int i = 0; i < matrix.length; i++) {
            result = false;
            if (matrix[i][column] == 0) {
                result = true;
            } else {
                break;
            }
            column--;
        }
        if (result) {
            System.out.println("0s on sub-diagonal");
            result2 = false;
        }
        column = size - 1;
        for (int i = 0; i < matrix.length; i++) {
            result = false;
            if (matrix[i][column] == 1) {
                result = true;
            } else {
                break;
            }
            column--;
        }
        if (result) {
            System.out.println("1s on sub-diagonal");
            result2 = false;
        }
        if (result2) {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
}
