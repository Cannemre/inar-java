package week_06.assignments;

public class Question_06_27 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 2; i <= 1000000 ; i++) {
            if (isPrime(i) && isPrime(reverseNumber(i)) && i != reverseNumber(i)) {
                counter++;
                System.out.printf("%6d", i);
                if (counter % 10 == 0) {
                    System.out.println();
                }
            }
            if (counter == 100) {
                break;
            }
        }

    }
    public static boolean isPrime(int n) {
        boolean prime = n != 1 && n != 0;
        for (int i = n / 2; i > 1; i--) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static int reverseNumber(int n) {
        String reverse = "";
        int digit;
        while (n > 0) {
            digit = n % 10;
            reverse += digit;
            n /= 10;
        }
        return Integer.parseInt(reverse);
    }
}
