package week_13.assignments.Question_13_07;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void howToColor() {
        if (super.getColor() != null) {
            System.out.println("Color all four sides");
        }
    }
}
