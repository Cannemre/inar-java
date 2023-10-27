package week_08.assignments;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {
        int[][] matrix = arrayInput();
        System.out.printf("The maximum square sub-matrix is at (%d, %d) with size %d",
                findLargestBlock(matrix)[0], findLargestBlock(matrix)[1], findLargestBlock(matrix)[2]);
    }

    public static int[][] arrayInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int numberOfRows = input.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfRows];
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[] findLargestBlock(int[][] m) {
        int[] result = new int[3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1 && size(m, i, j) > result[2]) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = size(m,i,j);
                }
            }
        }
        return result;
    }

    public static int size(int[][] m, int a, int b) {
        int counter = 1;
        int result = 0;
        for (int i = b + 1; i < m.length; i++) {
            if (m[a][i] == 1 && i != m.length - 1) {
                counter++;
            } else {
                if (i == m.length - 1) {
                    counter++;
                }
                if (counter < 2) {
                    return 0;
                } else {
                    result = counter;
                    while (counter - 1 > 0) {
                        for (int j = b; j < b + counter; j++) {
                            if (m[a][j] != 1) {
                                return 0;
                            }
                        }
                        if (a < m.length - 2) {
                            a++;
                        }
                        counter--;
                    }
                }
            }
        }
        return result;
    }
}
