package week_13.assignments.Question_13_10;

import week_13.assignments.Question_13_05.GeometricObject;

public class Question_13_10 {
    public static void main(String[] args) {
        GeometricObject rectangle1 = new Rectangle(3,5);
        GeometricObject rectangle2 = new Rectangle(3,5);
        GeometricObject rectangle3 = new Rectangle(6,4);
        System.out.printf("Rectangle1 %s\nRectangle2 %s\nRectangle3 %s\n", rectangle1, rectangle2, rectangle3);
        if (isEqual(rectangle1, rectangle2)) {
            System.out.println("Rectangle1 is equal to Rectangle2");
        } else {
            System.out.println("Rectangle1 is  not equal to Rectangle2");
        }
        if (isEqual(rectangle1, rectangle3)) {
            System.out.println("Rectangle1 is equal to Rectangle3");
        } else {
            System.out.println("Rectangle1 is  not equal to Rectangle3");
        }
    }

    public static boolean isEqual(GeometricObject object1, GeometricObject object2) {
        return object1.compareTo(object2) == 0;
    }
}

