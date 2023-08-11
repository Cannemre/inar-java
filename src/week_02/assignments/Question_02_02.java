package week_02.assignments;

import java.util.Scanner;

public class Question_02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double length;
        double area;
        double volume;
        final double PI = 3.141592653589793;
        System.out.println(" Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();
        area = radius * radius * PI;
        volume = area * length;
        System.out.println(" The area is " + area);
        System.out.println(" The volume is " + volume);

    }
}
