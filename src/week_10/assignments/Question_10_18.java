package week_10.assignments;

import java.math.BigInteger;

public class Question_10_18 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        number = number.add(BigInteger.ONE);
        int count = 0;
        while (count < 5) {
            if (isPrime(number)) {
                count++;
                System.out.println(number);
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isPrime(BigInteger integer) {
        for (BigInteger number = new BigInteger("2"); number.compareTo(integer.divide(new BigInteger("2"))) <= 0; number = number.add(BigInteger.ONE)) {
            if (integer.remainder(number).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }
}


