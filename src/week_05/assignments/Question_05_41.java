package week_05.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int maxCounter = 1;
        int number;
        do {
            System.out.print("Enter integers (it ends with input of 0): ");
            number = input.nextInt();
            if (number == max) {
                maxCounter++;
            }
            if (number > max) {
                max = number;
                maxCounter = 1;
            }
        } while (number != 0);
        System.out.printf("The largest count %d and the occurrence of the count is %d", max, maxCounter);
    }
}
