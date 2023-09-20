package week_06.assignments;

public class Question_06_10 {
    public static void main(String[] args) {
        System.out.println("The number of prime numbers less than 10,000 is: " + isPrime(10000));
    }
    public static int isPrime (int n) {
        int counter = 0;
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = i / 2; j > 1 ; j--) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                counter++;
            }
        }
        return counter;
    }
}
