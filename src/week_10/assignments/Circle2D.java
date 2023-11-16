package week_10.assignments;

public class Circle2D {
    double x;
    double y;
    double radius;
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2)) <= radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow((circle.getX() - this.x), 2) + Math.pow((circle.getY() - this.y), 2));
        return distance <= Math.abs(this.radius - circle.getRadius());
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow((circle.getX() - this.x), 2) + Math.pow((circle.getY() - this.y), 2));
        return distance <= this.radius + circle.getRadius();
    }
    public String toString() {
        return "Radius: " + radius;
    }
}
