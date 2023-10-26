package week_08.assignments;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {
        double[][] points = getFromUser();
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)", getRightMostLowestPoint(points)[0], getRightMostLowestPoint(points)[1]);
    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[6][2];
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static double[] getRightMostLowestPoint(double[][] points) {
        double[] rightmostLowest = new double[2];
        double lowest = points[0][1];
        int lowestIndex = 0;
        for (int j = 1; j < points.length; j++) {
            if (points[j][1] < lowest) {
                lowest = points[j][1];
                lowestIndex = j;
            }
        }
        double rightmost = points[lowestIndex][0];
        for (int j = 0; j < points.length; j++) {
            if (points[j][1] == lowest && points[j][0] > rightmost) {
                lowestIndex = j;
            }
        }
        rightmostLowest[0] = points[lowestIndex][0];
        rightmostLowest[1] = points[lowestIndex][1];
        return rightmostLowest;
    }
}
