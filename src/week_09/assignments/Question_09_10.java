package week_09.assignments;

import java.util.Scanner;

public class Question_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + equation.getRoot1());
        } else if (equation.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        } else {
            System.out.printf("The equation has two roots %.3f and %.3f", equation.getRoot1(), equation.getRoot2());
        }
    }
}
