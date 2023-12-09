package week_14.assignments.Question_14_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("Generated ArrayList:\n" + numbers);
        Set<Integer> hashNumbers = new HashSet<>();
        hashNumbers.addAll(numbers);
        System.out.println("ArrayList after removing duplicates:\n" + hashNumbers);
    }
}
