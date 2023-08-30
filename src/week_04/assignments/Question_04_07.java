package week_04.assignments;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the bounding circle:");
        double radius = input.nextDouble();
        double point1x = radius * Math.cos(Math.toRadians(18));
        double point1y = radius * Math.sin(Math.toRadians(18));
        double point2x = 0;
        double point2y = radius;
        double point3x = - point1x;
        double point3y = point1y;
        double point4x = - radius * Math.sin(Math.toRadians(36));
        double point4y = -1 * radius * Math.cos(Math.toRadians(36));
        double point5x = -1 * point4x;
        double point5y = -1 * point4y;
        System.out.printf("The coordinates of five points on the pentagon are \n(%f , %f) \n(%f , %f) \n(%f , %f) \n(%f , %f) \n(%f , %f)", point1x, point1y, point2x, point2y, point3x, point3y, point4x, point4y, point5x, point5y);


    }
}
