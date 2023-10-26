package week_08.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] table = new String[3][3];
        for (String[] strings : table) {
            Arrays.fill(strings, "|   ");
        }
        boolean result = true;
        boolean control = false;
        int order = 0;
        displayTable(table);
        while (result && !control) {
            if (order % 2 == 0) {
                System.out.print("Enter a row(0, 1 or 2) for player X: ");
                int rowX = input.nextInt();
                System.out.print("Enter a column(0, 1 or 2) for player X: ");
                int columnX = input.nextInt();
                table[rowX][columnX] = "| X ";
            } else {
                System.out.print("Enter a row(0, 1 or 2) for player O: ");
                int rowO = input.nextInt();
                System.out.print("Enter a column(0, 1 or 2) for player O: ");
                int columnO = input.nextInt();
                table[rowO][columnO] = "| O ";
            }
            for (int i = 0; i < table.length; i++) {
                if (table[i][0].equals(table[i][1]) && table[i][1].equals(table[i][2]) && table[i][0].equals("| X ")) {
                    result = false;
                } else if (table[i][0].equals(table[i][1]) && table[i][1].equals(table[i][2]) && table[i][0].equals("| O ")) {
                    control = true;
                } else if (table[0][i].equals(table[1][i]) && table[1][i].equals(table[2][i]) && table[0][i].equals("| X ")) {
                    result = false;
                } else if (table[0][i].equals(table[1][i]) && table[1][i].equals(table[2][i]) && table[0][i].equals("| O ")) {
                    control = true;
                }
            }
            if (table[0][0].equals(table[1][1]) && table[1][1].equals(table[2][2]) && table[0][0].equals("| X ")) {
                result = false;
            } else if (table[0][2].equals(table[1][1]) && table[1][1].equals(table[2][0]) && table[0][2].equals("| O ")) {
                control = true;
            } else if (table[0][2].equals(table[1][1]) && table[1][1].equals(table[2][0]) && table[0][2].equals("| X ")) {
                control = true;
            } else if (table[0][0].equals(table[1][1]) && table[1][1].equals(table[2][2]) && table[0][0].equals("| O ")) {
                control = true;
            }
            displayTable(table);
            order++;
        }
        if (control) {
            System.out.println("O player won!");
        }
        if (!result) {
            System.out.println("X player won!");
        }
    }

    public static void displayTable(String[][] array) {
        System.out.println("-------------");
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }
}
