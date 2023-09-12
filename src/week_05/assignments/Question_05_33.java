package week_05.assignments;

public class Question_05_33 {
    public static void main(String[] args) {
        System.out.println("Perfect numbers are:");
        int divisor;
        for (int i = 2; i <= 10000; i++) {
            divisor = 0;
            for (int j = i / 2; j >= 1; j--) {
                if (i % j == 0) {
                  divisor += j;
                }
            }
            if (divisor == i) {
                System.out.println(i);
            }
        }
    }
}
