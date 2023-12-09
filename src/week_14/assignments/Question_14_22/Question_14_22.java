package week_14.assignments.Question_14_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String n = input.next();
        if (isHappyNumber(n)) {
            System.out.println(n + " is a happy number");
        } else {
            System.out.println(n + " is not a happy number");
        }

    }

    public static boolean isHappyNumber(String n) {
        int m = Integer.parseInt(n);
        for (int i = 0; i < 100; i++) {
            int newM = 0;
            for (Integer digit : digits(m + "")) {
                newM += (int) Math.pow(digit, 2);
            }
            m = newM;
            if (m == 1) {
                return true;
            }
        }
        return false;
    }
    public static ArrayList<Integer> digits(String n) {
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            digits.add(Integer.parseInt(String.valueOf(n.charAt(i))));
        }
        return digits;
    }
}
