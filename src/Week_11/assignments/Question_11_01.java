package Week_11.assignments;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.print("Enter a color: ");
        String color = input.next();
        triangle.setColor(color);
        System.out.print("Is the triangle filled (true / false)? ");
        String isFilled = input.next();
        triangle.setFilled(isFilled.equalsIgnoreCase("true"));
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter() + "\nColor: " + triangle.getColor());
        if (isFilled.equalsIgnoreCase("true")) {
            System.out.println("Triangle is filled");
        } else {
            System.out.println("Triangle is not filled");
        }
    }
}
