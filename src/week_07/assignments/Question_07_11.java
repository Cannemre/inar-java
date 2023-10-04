package week_07.assignments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.printf("The mean is %.2f\n", mean(numbers));
        System.out.printf("The standard deviation is %.5f", deviation(numbers));
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (double i : x) {
            sum += i;
        }
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double sum = 0;
        double sumMean = 0;
        for (double i : x) {
            sum += Math.pow(i, 2);
            sumMean += i;
        }
        return Math.sqrt((sum - (Math.pow(sumMean,2) / x.length)) / (x.length - 1));
    }
}
