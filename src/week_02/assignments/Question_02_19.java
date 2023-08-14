package week_02.assignments;

import java.util.Scanner;

public class Question_02_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter three points for a triangle: ");
        double point1x = input.nextDouble();
        double point1y = input.nextDouble();
        double point2x = input.nextDouble();
        double point2y = input.nextDouble();
        double point3x = input.nextDouble();
        double point3y = input.nextDouble();
        double side1 = Math.pow(Math.pow(point2x - point1x, 2) + Math.pow(point2y - point1y, 2), 0.5);
        double side2 = Math.pow(Math.pow(point3x - point2x, 2) + Math.pow(point3y - point2y, 2), 0.5);
        double side3 = Math.pow(Math.pow(point3x - point1x, 2) + Math.pow(point3y - point1y, 2), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println(" The area of the triangle is " + (int) (area * 10) / 10.0);


    }
}
