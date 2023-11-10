package week_10.assignments;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Question_10_20 {
    public static void main(String[] args) {
        System.out.println("The e values for i = 100 to 1000:\ni                e\n----------------------------------\n");
        BigDecimal number = new BigDecimal(BigInteger.ONE);
        for (int i = 100; i <= 1000; i+= 100) {
            for (double j = 1; j <= i; j++) {
                BigDecimal divisor = new BigDecimal(BigInteger.ONE);
                for (int k = 1; k <= j; k++) {
                    divisor = divisor.multiply(new BigDecimal(k));
                }
                number = number.add(new BigDecimal("1").divide(divisor,20,BigDecimal.ROUND_UP));
            }
            System.out.printf("%d    %-30f\n", i, number);
            number = BigDecimal.valueOf(1);
        }
    }
}
