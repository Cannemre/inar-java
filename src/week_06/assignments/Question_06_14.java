package week_06.assignments;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.println("i       m(i)");
        System.out.println("--------------");
        estimatePi(901);
    }

    public static void estimatePi(int n) {
        double sum;
        double divisor;
        int j = 1;
        while (j <= n) {
            sum = 0;
            divisor = 1;
            for (int i = 1; i <= j; i++) {
                if (i % 2 == 0) {
                    sum -= 1 / divisor;
                } else {
                    sum += 1 / divisor;
                }
                divisor += 2;
            }
            sum *= 4;
            if (j == 1) {
                System.out.printf("%d       %.4f", j, sum);
            } else {
                System.out.printf("%d     %.4f", j, sum);

            }
            System.out.println();
            j += 100;
        }
    }
}
