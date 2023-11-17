package week_11.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int arraySize = input.nextInt();
        int[][] matrix = new int[arraySize][arraySize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        ArrayList<Integer> largestRow = new ArrayList<>();
        ArrayList<Integer> largestColumn = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }
            largestRow.add(counter);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    counter++;
                }
            }
            largestColumn.add(counter);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("The largest row index: ");
        for (int i = 0; i < largestRow.size(); i++) {
            if (largestRow.get(i).equals(Collections.max(largestRow))) {
                System.out.print(i + " ");
            }
        }
        System.out.println("The largest column index: ");
        for (int i = 0; i < largestColumn.size(); i++) {
            if (largestColumn.get(i).equals(Collections.max(largestColumn))) {
                System.out.print(i + " ");
            }
        }
    }
}
