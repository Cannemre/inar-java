package week_04.assignments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides:");
        double numberOfSides = input.nextDouble();
        System.out.println("Enter the side:");
        double side = input.nextDouble();
        double degree = 180;
        double area = numberOfSides * Math.pow(side,2) / (4 * Math.tan(Math.toRadians(degree) / numberOfSides));
        System.out.printf("The area of the polygon is %f", area);
    }
}
