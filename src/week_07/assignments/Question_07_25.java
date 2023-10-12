package week_07.assignments;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        if (solveQuadratic(eqn,roots) == 0) {
            System.out.println("The equation has no real root.");
        } else if (solveQuadratic(eqn,roots) == 1) {
            System.out.println("The number of real roots: " + solveQuadratic(eqn,roots));
            System.out.println("The root of equation: " + roots[0]);
        } else {
            System.out.println("The number of real roots: " + solveQuadratic(eqn,roots));
            System.out.println("The root of equation: " + roots[0] + " " + roots[1]);
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        double root1 = ((-eqn[1]) + (Math.sqrt(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2]))) / (2 * eqn[0]);
        double root2 = ((-eqn[1]) - (Math.sqrt(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2]))) / (2 * eqn[0]);
        if (discriminant > 0) {
            roots[0] = root1;
            roots[1] = root2;
            return 2;
        } else if (discriminant == 0) {
            roots[0] = root1;
            return 1;
        } else {
            return 0;
        }
    }
}
