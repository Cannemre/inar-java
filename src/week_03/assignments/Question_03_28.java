package week_03.assignments;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter r1's center x-, y-coordinates, width and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        System.out.println(" Enter r2's center x-, y-coordinates, width and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();
        double r1WidthDistance = x1 + (width1 / 2);
        double r1WidthDistanceOther = x1 - (width1 / 2);
        double r1HeightDistance = y1 + (height1 / 2);
        double r1HeightDistanceOther = y1 - (width1 / 2);
        double r2WidthDistance = x2 + (width2 / 2);
        double r2WidthDistanceOther = x2 - (width2 / 2);
        double r2HeightDistance = y2 + (height2 / 2);
        double r2HeightDistanceOther = y2 - (width2 / 2);
        if (r2WidthDistance <= r1WidthDistance && r2WidthDistanceOther >= r1WidthDistanceOther) {
            if (r2HeightDistance <= r1HeightDistance && r2HeightDistanceOther >= r1HeightDistanceOther) {
                System.out.println(" r2 is inside r1 ");
            }
        } else if (r1WidthDistanceOther <= r2WidthDistanceOther ^ r1HeightDistanceOther <= r2HeightDistanceOther) {
            if (r2WidthDistance <= r1WidthDistance ^ r2HeightDistance <= r1HeightDistance) {
                System.out.println(" r2 overlaps r1 ");
            }
        } else {
            System.out.println(" r2 does not overlap r1");
        }
    }
}







