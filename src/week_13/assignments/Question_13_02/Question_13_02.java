package week_13.assignments.Question_13_02;

import java.util.ArrayList;
import java.util.Collections;

public class Question_13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);
        list.add(10);
        System.out.println("Before shuffle..");
        System.out.println(list);
        shuffle(list);
        System.out.println("After shuffle..");
        System.out.println(list);
    }
    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }
}
