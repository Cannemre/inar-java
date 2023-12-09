package week_13.assignments.Question_13_06;

import java.util.Date;

public class ComparableCircle implements Comparable<ComparableCircle> {
    double radius;
    String color;
    boolean filled;
    Date date = new Date();

    public ComparableCircle() {
        this.radius = 1;
    }

    public ComparableCircle(String color, double radius, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        }
        return 0;
    }
    public String toString() {
        return "\nIt is created on " + getDate() + "\nColor: " + getColor() + "\nisFilled: " + isFilled() + "\nRadius: " + getRadius()
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
