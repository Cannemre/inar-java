package week_08.assignments;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        int rowCountMax = 0;
        int rowIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > rowCountMax) {
                rowCountMax = rowCount;
                rowIndex = i;
            }
        }
        int columnCountMax = 0;
        int columnIndex = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int columnCount = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    columnCount++;
                }
            }
            if (columnCount > columnCountMax) {
                columnCountMax = columnCount;
                columnIndex = i;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + rowIndex);
        System.out.println("The largest column index: " + columnIndex);
    }
}
