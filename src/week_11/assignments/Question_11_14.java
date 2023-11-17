package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                list1.add(input.nextInt());
            } else if (i == 5) {
                System.out.print("Enter five integers for list2: ");
                list2.add(input.nextInt());
            } else {
                list2.add(input.nextInt());
            }
        }
        System.out.println("The combined list is " + union(list1,list2).toString());

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }
}
