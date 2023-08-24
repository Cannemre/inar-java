package week_03.assignments;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
        double root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
        if (discriminant < 0) {
            System.out.println(" The equation has no real roots ");
        } else if (discriminant == 0) {
            System.out.println(" The equation has one root " + root1);
        } else {
            System.out.println(" The equation has two roots " + (int) (root1 * 1000) / 1000.0 + " and " + (int) (root2 * 1000) / 1000.0);
        }


    }
}
