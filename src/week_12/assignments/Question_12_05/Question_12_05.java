package week_12.assignments.Question_12_05;

import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle.toString());
        System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
        System.out.println("Area of triangle is " + triangle.getArea());
    }
}
