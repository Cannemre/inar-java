package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }
        removeDuplicate(numbers);
        System.out.println("The distinct integers are " + numbers.toString());
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && j != i) {
                    list.remove(list.get(j));
                }
            }
        }
    }
}
