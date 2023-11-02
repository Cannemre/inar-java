package week_09.assignments;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random numbers = new Random(1000);
        System.out.println("Random numbers are: ");
        for (int i = 1; i <= 50; i++) {
            System.out.print(numbers.nextInt(100) + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
