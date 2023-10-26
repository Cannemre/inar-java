package week_08.assignments;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        System.out.printf("The intersecting point is at (%.2f, %.2f)", getIntersectingPoint(points)[0], getIntersectingPoint(points)[1]);
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] result = new double[2];
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = (a * points[0][0]) - (b * points[0][1]);
        double f = (c * points[2][0]) - (d * points[2][1]);
        if ((a * d) - (b * c) == 0) {
            System.out.println("The two lines are parallel");
            System.exit(1);
        }
        result[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
        result[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return result;
    }
}
