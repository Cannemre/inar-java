package week_14.assignments.Question_14_26;

import java.util.ArrayList;
import java.util.LinkedList;

import static week_07.assignments.Question_07_14.gcd;

public class Question_14_26 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(74);
        list.add(70);
        list.add(58);
        list.add(35);
        System.out.println("Original Linked List:\n" + list);
        ArrayList<Integer> gcd = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            gcd.add(gcd(list.get(i), list.get(i + 1)));
        }
        int index = 1;
        int control = 0;
        int size = list.size();
        while (control < size - 1) {
            list.add(index, gcd.get(control));
            control++;
            index += 2;
        }
        System.out.println("Updated Linked List:\n" + list);
    }
}
