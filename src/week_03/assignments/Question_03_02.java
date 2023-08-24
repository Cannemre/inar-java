package week_03.assignments;

import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        int total = number1 + number2 + number3;
        System.out.println(" What is " + number1 + " + " + number2 + " + " + number3 + " = ?");
        int answer = input.nextInt();
        if (answer == total) {
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is true");
        } else {
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is false");
        }

    }
}
