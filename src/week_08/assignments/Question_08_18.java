package week_08.assignments;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        displayArray(m);
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int j = (int) (Math.random() * (m.length - 1));
            int temp = m[i][0];
            m[i][0] = m[j][0];
            m[j][0] = temp;
            int temp2 = m[i][1];
            m[i][1] = m[j][1];
            m[j][1] = temp2;
        }
    }

    public static void displayArray(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
