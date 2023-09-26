package week_06.assignments;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        System.out.println("The area of the pentagon is " + area(s));
    }

    public static double area(double side) {
        return (5 * Math.pow(side,2)) / (4 * Math.tan(Math.toRadians(180 / 5.0)));
    }
}
