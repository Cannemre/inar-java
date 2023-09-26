package week_06.assignments;

public class Question_06_26 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 2; i <= 100000; i++) {
            if (palindromicPrimeNumbers(i)) {
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

    public static boolean palindromicPrimeNumbers(int n) {
        return (isPrime(n) && (n + "").equals(reverseNumber(n)));
    }


    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = n / 2; i > 1; i--) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }


    public static String reverseNumber(int n) {
        String reverse = "";
        int digit;
        while (n > 0) {
            digit = n % 10;
            reverse += digit;
            n /= 10;
        }
        return reverse;
    }
}
