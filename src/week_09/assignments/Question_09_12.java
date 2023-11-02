package week_09.assignments;

import java.util.Scanner;

public class Question_09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = (a * points[0][0]) - (b * points[0][1]);
        double f = (c * points[2][0]) - (d * points[2][1]);
        LinearEquation equation = new LinearEquation(a,b,c,d,e,f);
        if (equation.isSolvable()) {
            System.out.printf("The intersecting point is at (%.5f, %.5f)", equation.getX(), equation.getY());
        } else {
            System.out.println("The two lines are parallel");
        }

    }
}
