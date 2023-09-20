package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            counter++;
            System.out.printf("%6d ", getPentagonalNumber(i));
            if (counter % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        n = n * (3 * n - 1) / 2;
        return n;
    }
}
