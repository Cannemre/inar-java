package week_06.assignments;

import java.util.Scanner;

public class Question_06_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2: ");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();
        if (leftOfTheLine(p0x, p0y, p1x, p1y, p2x, p2y)) {
            System.out.printf("(%f, %f) is on the left side of the line from (%f, %f) to (%f, %f)", p2x, p2y, p0x, p0y, p1x, p1y);
        } else if (onTheSameLine(p0x, p0y, p1x, p1y, p2x, p2y)) {
            System.out.printf("(%f, %f) is on the same line from (%f, %f) to (%f, %f)", p2x, p2y, p0x, p0y, p1x, p1y);
        } else if (onTheLineSegment(p0x, p0y, p1x, p1y, p2x, p2y)) {
            System.out.printf("(%f, %f) is on the right side of the line from (%f, %f) to (%f, %f)", p2x, p2y, p0x, p0y, p1x, p1y);
        }
    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double formula = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return formula > 0;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double formula = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return formula == 0;
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        double formula = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return formula < 0;
    }
}
