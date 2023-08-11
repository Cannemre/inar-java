package week_02.assignments;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v0;
        double v1;
        double t;
        double acceleration;
        System.out.println(" Enter v0, v1, and t: ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();
        acceleration = (v1 - v0) / t;
        System.out.println(" The average acceleration is " + acceleration);

    }
}
