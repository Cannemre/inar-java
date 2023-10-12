package week_07.assignments;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();
        int[] values = new int[numberOfValues];
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        int counter = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > 2) {
                return true;
            }
        }
        return false;
    }
}
