package week_07.assignments;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] valueList = new double[10];
        System.out.print("Enter ten values of double type: ");
        for (int i = 0; i < 10; i++) {
            double value = input.nextDouble();
            valueList[i] = value;
        }
        System.out.println("The average value: " + average(valueList));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double j : array) {
            sum += j;
        }
        return sum / array.length;
    }
}
