package week_14.assignments.Question_14_01;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("Generated integers: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);
    }
}
