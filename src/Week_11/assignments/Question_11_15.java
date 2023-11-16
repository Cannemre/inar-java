package Week_11.assignments;

import week_08.assignments.Question_08_32;

import java.util.Scanner;

public class Question_11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints + 1][2];
        System.out.print("Enter the coordinates of the points: ");
        for (int i = 0; i < points.length - 1; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        double minX = points[0][0];
        double minY = points[0][1];
        double maxX = points[0][0];
        double maxY = points[0][1];
        for (int i = 0; i < points.length - 1; i++) {
            if (points[i][0] < minX) {
                minX = points[i][0];
            }
            if (points[i][0] > maxX) {
                maxX = points[i][0];
            }
            if (points[i][1] < minY) {
                minY = points[i][1];
            }
            if (points[i][1] > maxY) {
                maxY = points[i][1];
            }
        }
        points[numberOfPoints][0] = (Math.random() * maxX) + minX;
        points[numberOfPoints][1] = (Math.random() * maxY) + minY;
        double area = 0;
        for (int i = 0; i < points.length - 2; i++) {
            area += triangleArea(points, i, i + 1);
        }
        System.out.println("The total area is " + area);
    }

    public static double triangleArea(double[][] points, int point1, int point2) {
        double s = (Question_08_32.distance(points, point1, point2) + Question_08_32.distance(points, point1, points.length - 1) + Question_08_32.distance(points, point2, points.length - 1)) / 2;
        double side1 = Question_08_32.distance(points, point1, point2);
        double side2 = Question_08_32.distance(points, point1, points.length - 1);
        double side3 = Question_08_32.distance(points, point2, points.length - 1);
        return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
    }
}
