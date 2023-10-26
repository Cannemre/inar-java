package week_08.assignments;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        displayArray(matrix);
        if (rowEven(matrix)) {
            System.out.println("Every row have an even number of 1s");
        } else {
            System.out.println("Every row does not have an even number of 1s");
        }
        if (columnEven(matrix)) {
            System.out.println("Every column have an even number of 1s");
        } else {
            System.out.println("Every column does not have an even number of 1s");
        }
    }

    public static boolean rowEven(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }
            if (counter == 0) {
                return false;
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean columnEven(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    counter++;
                }
            }
            if (counter == 0) {
                return false;
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
