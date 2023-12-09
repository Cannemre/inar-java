package week_13.assignments.Question_13_11;

import week_13.assignments.Question_13_05.GeometricObject;

public class Octagon extends GeometricObject {
    private double side;

    public Octagon() {

    }

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2) * (2 + 4 / Math.sqrt(2));
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }
}
