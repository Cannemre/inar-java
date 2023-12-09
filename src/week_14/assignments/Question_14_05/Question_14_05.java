package week_14.assignments.Question_14_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Enter integers for ArrayList nums (enter -1 to stop): ");
        while (true) {
            int input2 = input.nextInt();
            if (input2 == -1) {
                break;
            } else {
                integers.add(input2);
            }
        }
        int[] list = new int[integers.size()];
        int index = 0;
        int zeroIndex = integers.size() - 1;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == 0) {
                list[zeroIndex] = integers.get(i);
                zeroIndex--;
            } else {
                list[index] = integers.get(i);
                index++;
            }
        }
        System.out.println("ArrayList after moving zeros to the end: \n" + Arrays.toString(list));
    }
}
