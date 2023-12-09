package week_13.assignments.Question_13_09;

import week_13.assignments.Question_13_05.GeometricObject;

public class Question_13_09 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(5);
        GeometricObject circle2 = new Circle(6);
        GeometricObject circle3 = new Circle(5);
        System.out.printf("Circle1 %s\nCircle2 %s\nCircle3 %s\n", circle1, circle2, circle3);
        if (isEqual(circle1, circle2)) {
            System.out.println("Circle1 is equal to circle2");
        } else {
            System.out.println("Circle1 is  not equal to circle2");
        }
        if (isEqual(circle1, circle3)) {
            System.out.println("Circle1 is equal to circle3");
        } else {
            System.out.println("Circle1 is  not equal to circle3");
        }
    }

    public static boolean isEqual(GeometricObject object1, GeometricObject object2) {
        return object1.compareTo(object2) == 0;
    }
}
