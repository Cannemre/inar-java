package week_06.assignments;

import java.util.Scanner;

public class Question_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        System.out.println("The area of the polygon is " + area(sides, s));
    }

    public static double area(int n, double s) {
        return (n * Math.pow(s,2)) / (4 * Math.tan(Math.toRadians(180.0 / n)));
    }
}
