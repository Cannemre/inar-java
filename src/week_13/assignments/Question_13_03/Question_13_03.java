package week_13.assignments.Question_13_03;

import java.util.ArrayList;
import java.util.Collections;

public class Question_13_03 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1.0);
        list.add(1.5);
        list.add(1.53);
        list.add(5.0);
        list.add(12.5);
        list.add(65.0);
        list.add(10.0);
        System.out.println("Before sorting..");
        System.out.println(list);
        sort(list);
        System.out.println("After sorting..");
        System.out.println(list);
    }
    public static void sort(ArrayList<Number> list) {
        ArrayList<Double> result = new ArrayList<>();
        for (Number number : list) {
            result.add((double) number);
        }
        list.clear();
        Collections.sort(result);
        list.addAll(result);
    }
}
