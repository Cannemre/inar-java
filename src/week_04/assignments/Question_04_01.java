package week_04.assignments;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 180;
        System.out.println("Enter the length from the center to a vertex:");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin(Math.toRadians(PI / 5));
        double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.toRadians(PI / 5)));
        System.out.println("The area of the pentagon is " + Math.ceil(area));


    }
}
