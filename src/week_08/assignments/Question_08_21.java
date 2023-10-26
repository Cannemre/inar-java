package week_08.assignments;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCity = input.nextInt();
        double[][] coordinates = new double[numberOfCity][2];
        double[] totalDistance = new double[numberOfCity];
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < numberOfCity; i++) {
            for (int j = 0; j < numberOfCity; j++) {
                totalDistance[i] += distance(coordinates, i, j);
            }
        }
        double min = totalDistance[0];
        int centralCity = 0;
        for (int i = 1; i < totalDistance.length; i++) {
            if (min > totalDistance[i]) {
                min = totalDistance[i];
                centralCity = i;
            }
        }
        System.out.printf("The central city is at (%.1f, %.1f) \n", coordinates[centralCity][0], coordinates[centralCity][1]);
        System.out.printf("The total distance to all cities is %.2f", min);
    }

    public static double distance(double[][] points, int point1, int point2) {
        return Math.sqrt(Math.pow(points[point2][0] - points[point1][0], 2) + Math.pow(points[point2][1] - points[point1][1], 2));
    }
}
