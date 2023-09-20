package week_06.assignments;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i       m(i)");
        System.out.println("---------------");
        sumSeries(20);
    }

    public static void sumSeries(int n) {
        double divisor = 2;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i / divisor;
            if (i < 10) {
                System.out.printf("%d       %.4f", i, sum);
            } else {
                System.out.printf("%d      %.4f", i, sum);
            }
            System.out.println();
            divisor++;
        }
    }
}
