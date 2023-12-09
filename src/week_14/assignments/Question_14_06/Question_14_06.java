package week_14.assignments.Question_14_06;

import java.util.ArrayList;

public class Question_14_06 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random() * 100));
        }
        ArrayList<Integer> integersOdd = new ArrayList<>();
        ArrayList<Integer> integersEven = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                integersEven.add(integer);
            } else {
                integersOdd.add(integer);
            }
        }
        System.out.println("Original List: " + integers);
        integers.clear();
        integers.addAll(integersOdd);
        integers.addAll(integersEven);
        System.out.println("Rearranged List: " + integers);

    }
}
