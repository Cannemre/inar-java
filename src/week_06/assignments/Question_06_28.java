package week_06.assignments;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s", "p", "2^p-1");
        System.out.println();
        System.out.println("-------------------------");
        for (int i = 0; i <= 31; i++) {
            if (isMersennePrime(i)) {
                System.out.printf("%-15s%-15s\n", i, (int) (Math.pow(2, i) - 1));
            }
        }
    }

    public static boolean isMersennePrime(int n) {
        int mersenne = (int) (Math.pow(2, n) - 1);
        return (Question_06_27.isPrime(n) && Question_06_27.isPrime(mersenne));
    }
}
