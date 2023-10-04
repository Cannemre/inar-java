package week_07.assignments;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numberListCount = new int[101];
        int number = 1;
        System.out.print("Enter the integers between 1 and 100: ");
        while (number != 0) {
            number = input.nextInt();
            numberListCount[number]++;
        }
        for (int i = 1; i < numberListCount.length; i++) {
            if (numberListCount[i] == 1) {
                System.out.println(i + " occurs " + numberListCount[i] + " time");
            } else if (numberListCount[i] > 1) {
                System.out.println(i + " occurs " + numberListCount[i] + " times");
            }
        }
    }
}
