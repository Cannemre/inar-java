package week_13.assignments.Question_13_05;

import week_13.assignments.Question_13_11.Octagon;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>, Cloneable {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this.dateCreated = new Date();
        this.color = "white";
    }

    public GeometricObject(String color, boolean filled) {
        this.dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        return "\nIt is created on " + getDateCreated() + "\nColor: " + getColor() + "\nisFilled: " + isFilled()
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        }
        return 0;
    }
    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
