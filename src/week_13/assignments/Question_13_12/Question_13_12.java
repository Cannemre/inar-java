package week_13.assignments.Question_13_12;

import week_13.assignments.Question_13_05.GeometricObject;
import week_13.assignments.Question_13_09.Circle;
import week_13.assignments.Question_13_10.Rectangle;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(10);
        objects[1] = new Circle(14);
        objects[2] = new Rectangle(20,40);
        objects[3] = new Rectangle(25,55);
        System.out.println("Total area of Geometric Objects: " + sumArea(objects));
    }
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject object : a) {
            sum += object.getArea();
        }
        return sum;
    }
}
