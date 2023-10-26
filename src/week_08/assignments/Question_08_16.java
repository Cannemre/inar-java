package week_08.assignments;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] numbers = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(numbers);
        displayArray(numbers);
    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[j][0] < m[i][0]) {
                    int temp = m[j][0];
                    m[j][0] = m[i][0];
                    m[i][0] = temp;
                    int temp2 = m[j][1];
                    m[j][1] = m[i][1];
                    m[i][1] = temp2;
                }
            }
        }
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[j][1] < m[i][1] && m[j][0] == m[i][0]) {
                    int temp = m[j][0];
                    m[j][0] = m[i][0];
                    m[i][0] = temp;
                    int temp2 = m[j][1];
                    m[j][1] = m[i][1];
                    m[i][1] = temp2;
                }
            }
        }
    }

    public static void displayArray(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
        }
    }
}