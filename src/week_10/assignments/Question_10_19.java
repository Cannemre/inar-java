package week_10.assignments;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        System.out.println("p    2^p-1");
        for (int i = 2; i < 100; i++) {
            BigInteger integer = new BigInteger((int) (Math.pow(2, i) - 1) + "");
            if (isPrime(i) && isPrimeBigInteger(integer)) {
                System.out.printf("%-7d%-30d\n", i, integer);
            }
        }
    }

    public static boolean isPrimeBigInteger(BigInteger integer) {
        for (BigInteger number = new BigInteger("2"); number.compareTo(integer.divide(new BigInteger("2"))) <= 0; number = number.add(BigInteger.ONE)) {
            if (integer.remainder(number).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int number) {
        for (int n = 2; n <= number / 2; n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }
}
