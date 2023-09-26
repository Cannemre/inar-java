package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers are: ");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%6d ", getPentagonalNumber(i));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        n = n * (3 * n - 1) / 2;
        return n;
    }
}
