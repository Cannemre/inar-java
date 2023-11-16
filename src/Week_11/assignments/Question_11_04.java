package Week_11.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        getFromUser(list);
        System.out.println("The largest number in the list is " + max(list));
    }
    public static void getFromUser(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers ending with 0: ");
        int number = input.nextInt();
        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }
    }
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return Collections.max(list);
        }
    }
}
