package week_13.assignments.Question_13_11;

import week_13.assignments.Question_13_05.GeometricObject;

public class Question_13_11 {
    public static void main(String[] args) {
        GeometricObject octagon = new Octagon(5);
        System.out.println("Area: " + octagon.getArea() + "\nPerimeter: " + octagon.getPerimeter());
        System.out.println("\nCloning the Octagon...");
        GeometricObject octagonClone = octagon.clone();
        if (octagon.compareTo(octagonClone) == 0) {
            System.out.println("Octagon is equal to its clone.");
        }
    }
}
