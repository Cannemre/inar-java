package week_10.assignments;

import java.math.BigDecimal;

public class Question_10_17 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        long smallestSquare = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal square = new BigDecimal(smallestSquare);
        int count = 0;
        while (count < 10) {
            BigDecimal result = square.multiply(square);
            if (result.compareTo(new BigDecimal(Long.MAX_VALUE)) > 0) {
                System.out.println(result);
                count++;
            }
            square = square.add(new BigDecimal("1"));
        }
    }
}
