package week_10.assignments;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        BigInteger integer = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger result = new BigInteger("0");
        BigInteger decrease = new BigInteger("1");
        BigInteger divisor1 = new BigInteger("2");
        BigInteger divisor2 = new BigInteger("3");
        int counter = 0;
        while (counter < 10) {
            if (integer.mod(divisor1).equals(result) || integer.mod(divisor2).equals(result)) {
                System.out.println(integer);
                counter++;
            }
            integer = integer.add(decrease);
        }
    }
}
