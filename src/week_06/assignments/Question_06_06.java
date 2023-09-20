package week_06.assignments;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        displayPattern(rows);
    }
    public static void displayPattern (int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = n - i; j > 0 ; j--) {
                System.out.print("    ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.printf("%4d", k);
            }
            System.out.println();
        }
    }
}
