package week_05.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double total2 = 0;
        double deviation;

        for (int i = 0; i < 10 ; i++) {
            System.out.print("Enter ten numbers: ");
            double numbers = input.nextDouble();
            total2 += Math.pow(numbers, 2);
            total += numbers;
        }
        deviation = Math.sqrt((total2 - (Math.pow(total, 2) / 10)) / 9);
        System.out.println("The mean is " + total / 10);
        System.out.printf("The standard deviation is %.5f", deviation);
    }
}
