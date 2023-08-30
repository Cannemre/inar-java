package week_04.assignments;

import java.util.Scanner;

public class Question_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 180;
        System.out.println("Enter the side:");
        double side = input.nextDouble();
        double area = 6 * Math.pow(side, 2) / (4 * Math.tan(Math.toRadians(PI / 6)));
        System.out.println(area);
        System.out.printf("The area of the hexagon is %f " , area);
    }
}
