package week_10.assignments;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public boolean contains(double x, double y) {
        return Math.abs(x) >= Math.abs(this.x - width / 2) && Math.abs(x) <= Math.abs(this.x + width / 2) && Math.abs(y) >= Math.abs(this.y - height / 2) && Math.abs(y) <= Math.abs(this.y + height / 2);
    }

    public boolean contains(MyRectangle2D r) {
        return contains(r.getY() + height / 2, r.getX() + width / 2) && contains(r.getY() - height / 2, r.getX() - width / 2) && contains(r.getY() - height / 2, r.getX() + width / 2) && contains(r.getY() + height / 2, r.getX() - width / 2);
    }

    public boolean overlaps(MyRectangle2D r) {
        return contains(r.getY() + height / 2, r.getX() + width / 2) || contains(r.getY() - height / 2, r.getX() - width / 2) || contains(r.getY() - height / 2, r.getX() + width / 2) || contains(r.getY() + height / 2, r.getX() - width / 2);
    }
}
