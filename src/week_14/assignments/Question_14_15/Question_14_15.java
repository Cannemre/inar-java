package week_14.assignments.Question_14_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = input.nextInt();
        Map<Integer, Integer> hashMap = new HashMap<>();
        System.out.print("Enter the elements of the ArrayList (each in the range [1, n]): ");
        for (int i = 0; i < n; ) {
            int value = input.nextInt();
            if (value > 0 && value <= n) {
                hashMap.put(i, value);
                i++;
            }
        }
        ArrayList<Integer> missingIntegers = new ArrayList<>();
        int[] control = new int[n + 1];
        for (int i = 0; i < hashMap.size(); i++) {
            control[hashMap.get(i)]++;
        }
        for (int i = 1; i < control.length; i++) {
            if (control[i] == 0) {
                missingIntegers.add(i);
            }
        }
        System.out.println("Number missing from the ArrayList: " + missingIntegers);
    }
}
