package week_14.assignments.Question_14_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.print("Enter the size 'n' for ArrayList A: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " Integers for ArrayList A: ");
        for (int i = 0; i < n; i++) {
            integers.add(input.nextInt());
        }
        System.out.print("Enter the size 'n' for ArrayList B: ");
        n = input.nextInt();
        ArrayList<Integer> integers2 = new ArrayList<>();
        System.out.print("Enter " + n + " Integers for ArrayList B: ");
        for (int i = 0; i < n; i++) {
            integers2.add(input.nextInt());
        }
        Collections.sort(integers);
        Collections.sort(integers2);
        Collections.reverse(integers2);
        ArrayList<Integer> integers3 = new ArrayList<>();
        integers3.addAll(integers);
        integers3.addAll(integers2);
        System.out.println("Merged and sorted ArrayList C: \n" + integers3);
    }
}
