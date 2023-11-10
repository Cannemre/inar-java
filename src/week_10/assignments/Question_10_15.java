package week_10.assignments;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.print("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        MyRectangle2D r = getRectangle(points);
        System.out.printf("The bounding r's center (%.2f, %.2f), width %.2f, height %.2f", r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];
        for (double[] point : points) {
            if (point[0] < minX) {
                minX = point[0];
            }
            if (point[0] > maxX) {
                maxX = point[0];
            }
        }
        for (double[] point : points) {
            if (point[1] < minY) {
                minY = point[1];
            }
            if (point[1] > maxY) {
                maxY = point[1];
            }
        }
        return new MyRectangle2D(minX + (maxX - minX) / 2,minY + (maxY - minY) / 2,maxX - minX, maxY - minY);
    }
}
