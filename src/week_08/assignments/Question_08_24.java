package week_08.assignments;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] sudoku = new int[9][9];
        System.out.print("Enter a Sudoku puzzle solution: ");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                sudoku[i][j] = input.nextInt();
            }
        }
        if (isValid(sudoku)) {
            System.out.println("Valid solution");
        } else {
            System.out.println("Invalid solution");
        }
    }

    public static boolean isValid(int[][] sudoku) {
        return rowIsValid(sudoku) && columnIsValid(sudoku) && boxesIsValid(sudoku);
    }

    public static boolean rowIsValid(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length - 1; j++) {
                if (sudoku[i][j] == sudoku[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean columnIsValid(int[][] sudoku) {
        for (int i = 0; i < sudoku[0].length; i++) {
            for (int j = 0; j < sudoku.length - 1; j++) {
                if (sudoku[j][i] == sudoku[j + 1][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean boxesIsValid(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
                    for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                        if (row != i && col != j && sudoku[row][col] == sudoku[i][j])
                            return false;
            }
        }
        return true;
    }
}
