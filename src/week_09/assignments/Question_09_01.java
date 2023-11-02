package week_09.assignments;

public class Question_09_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("--Rectangle 1--");
        displayRectangle(rectangle1);
        System.out.println("--Rectangle 2--");
        displayRectangle(rectangle2);
    }

    public static void displayRectangle(Rectangle rectangle) {
        System.out.printf("Width     : %.2f\n", rectangle.width);
        System.out.printf("Height    : %.2f\n", rectangle.height);
        System.out.printf("Area      : %.2f\n", rectangle.getArea());
        System.out.printf("Perimeter : %.2f\n", rectangle.getPerimeter());
    }
}
