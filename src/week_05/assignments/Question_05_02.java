package week_05.assignments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_QUESTION = 10;
        int correctCount = 0;
        String result = "";
        long startTime = System.currentTimeMillis();
        int answer;
        int counter = 0;
        while (counter < NUMBER_OF_QUESTION) {
            int number1 = (int)(Math.random() * (16 - 1) + 1);
            int number2 = (int)(Math.random() * (16 - 1) + 1);
            System.out.print("What is " + number1 + " + " + number2 + " ? ");
            answer = input.nextInt();
            counter++;
            if (answer == number1 + number2) {
                System.out.println("You are correct !");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));
            }
            result += "\n" + number1 + " + " + number2 + " = " + answer + ((number1 + number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long time = (endTime - startTime) / 1000;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + time + " seconds\n" + result);
    }
}
