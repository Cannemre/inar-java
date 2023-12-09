package week_13.assignments.Question_13_01;

import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter the color: ");
        String color = input.next();
        System.out.print("Enter isFilled? true or false: ");
        String fill = input.next();
        boolean isFilled = fill.equalsIgnoreCase("true");
        GeometricObject triangle = new Triangle(color,isFilled, side1, side2, side3);
        System.out.println(triangle.toString());
    }
}
