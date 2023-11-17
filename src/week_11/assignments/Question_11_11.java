package week_11.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        getFromUser(list);
        System.out.println("Before sorting..\n" + list.toString());
        Collections.sort(list);
        System.out.println("\nAfter sorting..\n" + list.toString());
    }
    public static void getFromUser(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0: ");
        int number = input.nextInt();
        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }
    }
}
