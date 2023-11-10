package week_10.assignments;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger result = new BigInteger("0");
        BigInteger control1 = new BigInteger("5");
        BigInteger control2 = new BigInteger("6");
        int counter = 0;
        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:");
        while (counter < 10) {
            number = number.add(BigInteger.ONE);
            if (result.compareTo(number.remainder(control1)) == 0 || result.compareTo(number.remainder(control2)) == 0) {
                System.out.println(number);
                counter++;
            }
        }
    }
}
