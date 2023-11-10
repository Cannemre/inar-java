package week_10.assignments;

public class Question_10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("Rectangle:\n--------------------");
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        if (r1.contains(3,3)) {
            System.out.println("Contains the point (3, 3).");
        } else {
            System.out.println("Does not contains the point (3, 3).");
        }
        if (r1.contains(new MyRectangle2D(4,5,10.5,3.2))) {
            System.out.println("Contain the rectangle with points (4, 5, 10.5, 3.2)");
        } else {
            System.out.println("Does not contain the rectangle with points (4, 5, 10.5, 3.2)");
        }
        if (r1.overlaps(new MyRectangle2D(3,5,2.3,5.4))) {
            System.out.println("Overlap the rectangle with points (3, 5, 2.3, 5.4)");
        } else {
            System.out.println("Does not overlap the rectangle with points (3, 5, 2.3, 5.4)");
        }

    }
}
