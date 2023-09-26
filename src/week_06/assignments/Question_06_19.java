package week_06.assignments;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides for a triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        if (isValid(s1, s2, s3)) {
            System.out.println("The area of the triangle is " + area(s1, s2, s3));
        } else {
            System.out.println("Invalid input!");
        }
    }
    public static boolean isValid (double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
    public static double area (double side1, double side2, double side3) {
        double perimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }
}
