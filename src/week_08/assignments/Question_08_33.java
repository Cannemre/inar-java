package week_08.assignments;

import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {
        double[][] points = getFromUser();
        System.out.printf("The areas are %.2f, %.2f, %.2f and %.2f", getTriangleArea(points, 0, 1, 4),
                getTriangleArea(points, 1, 2, 4), getTriangleArea(points, 2, 3, 4),
                getTriangleArea(points, 0, 3, 4));
    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                if (i == 4) {
                    points[i][0] = getIntersectingPoint(points)[0];
                    points[i][1] = getIntersectingPoint(points)[1];
                    continue;
                }
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] result = new double[2];
        double a = points[0][1] - points[2][1];
        double b = points[0][0] - points[2][0];
        double c = points[1][1] - points[3][1];
        double d = points[1][0] - points[3][0];
        double e = (a * points[0][0]) - (b * points[0][1]);
        double f = (c * points[1][0]) - (d * points[1][1]);
        result[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
        result[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return result;
    }

    public static double getTriangleArea(double[][] points, int a, int b, int c) {
        double side1 = distance(points, a, b);
        double side2 = distance(points, a, c);
        double side3 = distance(points, c, b);
        double s = (side1 + side2 + side3) / 2;
        double formula = s * (s - side1) * (s - side2) * (s - side3);
        return Math.sqrt(formula);
    }

    public static double distance(double[][] points, int point1, int point2) {
        return Math.sqrt(Math.pow(points[point2][0] - points[point1][0], 2) + Math.pow(points[point2][1] - points[point1][1], 2));
    }
}
