package week_10.assignments;

public class MyPoint {
    double x;
    double y;
    MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }
}
