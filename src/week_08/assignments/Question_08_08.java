package week_08.assignments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double minDistance = distance(points, 0, 1);
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance(points, i, j) < minDistance) {
                    minDistance = distance(points, i, j);
                }
            }
        }
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance(points, i, j) == minDistance) {
                    System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n", points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }
        System.out.println("Their distance is " + minDistance);
    }

    public static double distance(double[][] points, int point1, int point2) {
        return Math.sqrt(Math.pow(points[point2][0] - points[point1][0], 2) + Math.pow(points[point2][1] - points[point1][1], 2));
    }
}
