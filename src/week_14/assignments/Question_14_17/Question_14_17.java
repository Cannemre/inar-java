package week_14.assignments.Question_14_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers (enter 0 to stop):");
        while (true) {
            int input2 = input.nextInt();
            if (input2 == 0) {
                break;
            } else {
                list.add(input2);
            }
        }
        int maxCounter = 0;
        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }
        System.out.println("Number(s) with the most occurrences:");
        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
            if (counter == maxCounter) {
                System.out.println(list.get(i) + " --> " + (maxCounter + 1) + " times.");
            }
        }
    }
}
