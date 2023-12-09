package week_13.assignments.Question_13_01;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
    public String toString() {
        return "\ncolor: " + super.getColor() + " and filled: " + super.isFilled() +
                "\nTriangle : side 1 : " + this.side1 +
                "\nTriangle : side 2 : " + this.side2 +
                "\nTriangle : side 3 : " + this.side3;
    }
}
