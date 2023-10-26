package week_08.assignments;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        String[][] headAndTails = new String[3][3];
        int index = 0;
        for (int i = 0; i < headAndTails.length; i++) {
            for (int j = 0; j < headAndTails[i].length; j++) {
                if (decimalToBinary(number)[index] == 0) {
                    headAndTails[i][j] = "H";
                } else {
                    headAndTails[i][j] = "T";
                }
                index++;
            }
        }
        for (int i = 0; i < headAndTails.length; i++) {
            for (int j = 0; j < headAndTails[i].length; j++) {
                System.out.print(headAndTails[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] decimalToBinary(int number) {
        int[] binaryNumber = new int[9];
        int i = binaryNumber.length - 1;
        while (number > 0) {
            binaryNumber[i] = number % 2;
            number /= 2;
            i--;
        }
        return binaryNumber;
    }
}
