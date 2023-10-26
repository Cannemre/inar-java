package week_08.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] table = new String[6][7];
        int[] redCounter = {5, 5, 5, 5, 5, 5, 5};
        int[] yellowCounter = {5, 5, 5, 5, 5, 5, 5};
        fillArray(table);
        boolean result = false;
        int counter = 0;
        displayTable(table);
        while (!result) {
            if (counter % 2 == 0) {
                System.out.print("Drop a red disk at column (0-6): ");
                int columnNumber = input.nextInt();
                table[redCounter[columnNumber]][columnNumber] = "|R";
                redCounter[columnNumber]--;
                yellowCounter[columnNumber]--;

            } else {
                System.out.print("Drop a yellow disk at column (0-6): ");
                int columnNumber = input.nextInt();
                table[yellowCounter[columnNumber]][columnNumber] = "|Y";
                yellowCounter[columnNumber]--;
                redCounter[columnNumber]--;
            }
            if (sameDiagonal(table)) {
                result = true;
            } else if (sameRow(table)) {
                result = true;
            } else if (sameColumn(table)) {
                result = true;
            }
            counter++;
            displayTable(table);
        }
        if ((counter - 1) % 2 == 0) {
            System.out.print("The red player won!");
        } else {
            System.out.print("The yellow player won!");
        }
    }

    public static void displayTable(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-------------------");
    }

    public static void fillArray(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            Arrays.fill(table[i], "| ");
        }
    }

    public static boolean sameDiagonal(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].equals("|R")) {
                    if (leftDiagonal(i, j, table) || rightDiagonal(i, j, table)) {
                        return true;
                    }
                } else if (table[i][j].equals("|Y")) {
                    if (leftDiagonal(i, j, table) || rightDiagonal(i, j, table)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean rightDiagonal(int n, int m, String[][] table) {
        if (n > 2) {
            return false;
        }
        if (m > 3) {
            return false;
        }
        int nY = n;
        int mY = m;
        int counterR = 0;
        for (int i = 0; i < 4; i++) {
            if (table[n][m].equals("|R")) {
                if (table[n + 1][m + 1].equals("|R")) {
                    counterR++;
                } else {
                    counterR = 0;
                }
                if (counterR == 3) {
                    return true;
                }
                n++;
                m++;
            }
        }
        int counterY = 0;
        for (int i = 0; i < 4; i++) {
            if (table[nY][mY].equals("|Y")) {
                if (table[nY + 1][mY + 1].equals("|Y")) {
                    counterY++;
                } else {
                    counterY = 0;
                }
                if (counterY == 3) {
                    return true;
                }
                nY++;
                mY++;
            }
        }
        return false;
    }

    public static boolean leftDiagonal(int n, int m, String[][] table) {
        if (n > 2) {
            return false;
        }
        if (m < 3) {
            return false;
        }
        int nY = n;
        int mY = m;
        int counterR = 0;
        for (int i = 0; i < 4; i++) {
            if (table[n][m].equals("|R")) {
                if (table[n + 1][m - 1].equals("|R")) {
                    counterR++;
                } else {
                    counterR = 0;
                }
                if (counterR == 3) {
                    return true;
                }
                n++;
                m--;
            }
        }
        int counterY = 0;
        for (int i = 0; i < 4; i++) {
            if (table[nY][mY].equals("|Y")) {
                if (table[nY + 1][mY - 1].equals("|Y")) {
                    counterY++;
                } else {
                    counterY = 0;
                }
                if (counterY == 3) {
                    return true;
                }
                nY++;
                mY++;
            }
        }
        return false;
    }

    public static boolean sameRow(String[][] table) {
        int counterR = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].equals("|R")) {
                    counterR++;
                } else {
                    counterR = 0;
                }
                if (counterR == 4) {
                    return true;
                }
            }
        }
        int counterY = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].equals("|Y")) {
                    counterY++;
                } else {
                    counterY = 0;
                }
                if (counterY == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sameColumn(String[][] table) {
        int counterR = 0;
        for (int i = 0; i < table[0].length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[j][i].equals("|R")) {
                    counterR++;
                } else {
                    counterR = 0;
                }
                if (counterR == 4) {
                    return true;
                }
            }
        }
        int counterY = 0;
        for (int i = 0; i < table[0].length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[j][i].equals("|Y")) {
                    counterY++;
                } else {
                    counterY = 0;
                }
                if (counterY == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
