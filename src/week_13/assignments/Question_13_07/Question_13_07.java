package week_13.assignments.Question_13_07;

public class Question_13_07 {
    public static void main(String[] args) {
        GeometricObject[] squares = {new Square(2), new Square(3), new Square(4), new Square(5, "red", true), new Square(6, "black", true)};
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Area of Geometric Object in the index " + i + " is: " + squares[i].getArea());
            ((Square) squares[i]).howToColor();
            System.out.println("-------------------------------------------");
        }
    }
}
