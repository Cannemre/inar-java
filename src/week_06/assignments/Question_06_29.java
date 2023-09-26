package week_06.assignments;

public class Question_06_29 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (Question_06_27.isPrime(i) && Question_06_27.isPrime(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }
}
