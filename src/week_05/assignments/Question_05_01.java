package week_05.assignments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numbers;
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int numberCounter = 0;
        double numbersTotal = 0;
        double average;
        do {
            System.out.print("Enter an integer, the input ends if it is 0: ");
            numbers = input.nextDouble();
            numbersTotal = numbers + numbersTotal;
            numberCounter++;
            average = numbersTotal / (numberCounter - 1);
            if (numbers < 0) {
                numberOfNegatives++;
            } else if (numbers > 0) {
                numberOfPositives++;
            }
        } while (numbers != 0);
        if (numberCounter > 1) {
            System.out.printf("The number of positives is %d\nThe number of negatives is %d\nThe total is %.1f\nThe average is %.2f", numberOfPositives, numberOfNegatives, numbersTotal, average);
        } else {
            System.out.println("No numbers are entered except 0");
        }
    }
}

