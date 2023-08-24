package week_03.assignments;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter three edges of the triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        double perimeter = edge1 + edge2 + edge3;
        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            System.out.println(" The perimeter is " + perimeter);
        } else {
            System.out.println(" The input is invalid !");
        }
    }
}
