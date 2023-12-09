package week_14.assignments.Question_14_07;

import java.util.ArrayList;

public class Question_14_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        int max = list.get(0);
        int secondMax = 0;
        for (Integer integer : list) {
            if (integer >= max) {
                secondMax = max;
                max = integer;
            } else if (integer > secondMax) {
                secondMax = integer;
            }
        }
        System.out.println(list);
        System.out.println("What is the 2. greatest number\nThe 2th largest element is: " + secondMax);
    }
}
