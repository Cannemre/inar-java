package week_14.assignments.Question_14_03;

public class Points implements Comparable<Points> {
    private double x;
    private double y;

    public Points() {

    }

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Points o) {
        if (getX() > o.getX()) {
            return 1;
        } else if (getX() < o.getX()) {
            return -1;
        } else {
            return Double.compare(getY(), o.getY());
        }
    }
}
