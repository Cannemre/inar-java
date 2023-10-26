package week_08.assignments;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        double[][] points = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        getFromUser(points);
        if (getTriangleArea(points) == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("The area of the triangle is %.2f", getTriangleArea(points));
        }
    }

    public static void getFromUser(double[][] list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = input.nextDouble();
            }
        }
    }

    public static double getTriangleArea(double[][] points) {
        double side1 = distance(points, 0, 1);
        double side2 = distance(points, 0, 2);
        double side3 = distance(points, 2, 1);
        double s = (side1 + side2 + side3) / 2;
        double formula = s * (s - side1) * (s - side2) * (s - side3);
        if (formula < 0) {
            return 0;
        }
        return Math.sqrt(formula);
    }

    public static double distance(double[][] points, int point1, int point2) {
        return Math.sqrt(Math.pow(points[point2][0] - points[point1][0], 2) + Math.pow(points[point2][1] - points[point1][1], 2));
    }
}
