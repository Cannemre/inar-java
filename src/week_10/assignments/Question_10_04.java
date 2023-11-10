package week_10.assignments;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10,30.5);
        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is: %f", point1.x, point1.y, point2.x, point2.y, point1.distance(point2));
    }
}
