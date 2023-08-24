package week_03.assignments;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 99) + 1;
        int number2 = (int) (Math.random() * 99) + 1;
        int total = number1 + number2;
        System.out.println(" What is " + number1 + " + " + number2 + " = ?");
        int answer = input.nextInt();
        if (total == answer) {
            System.out.println(" You are correct ! ");
        } else {
            System.out.println(" You are wrong ! " + number1 + " + " + number2 + " should be " + total);
        }
    }
}
