package week_14.assignments.Question_14_13;

import java.util.ArrayList;

public class Question_14_13 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        int n = (int) (Math.random() * 20);
        for (int i = 0; i < n; i++) {
            integers.add((int) (Math.random() * 3));
        }
        int[] counter = new int[3];
        for (Integer integer : integers) {
            counter[integer]++;
        }
        System.out.println("Generated integers: " + integers);
        integers.clear();
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > (n / 3)) {
                integers.add(i);
            }
        }
        System.out.println("Elements appearing more than n/3 times: " + integers);
    }
}
