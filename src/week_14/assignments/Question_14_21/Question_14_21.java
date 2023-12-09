package week_14.assignments.Question_14_21;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter the first list: ");
        for (int i = 0; i < 6; i++) {
            list1.add(input.nextInt());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter the second list: ");
        for (int i = 0; i < 6; i++) {
            list2.add(input.nextInt());
        }
        ArrayList<Integer> intersectionList = new ArrayList<>();
        for (Integer integer : list1) {
            if (list2.contains(integer)) {
                intersectionList.add(integer);
            }
        }
        System.out.println("Intersection of the two lists: " + intersectionList);
    }
}
