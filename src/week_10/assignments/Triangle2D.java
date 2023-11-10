package week_10.assignments;

public class Triangle2D {
    MyPoint p1;
    MyPoint p2;
    MyPoint p3;

    Triangle2D() {
        this.p1 = new MyPoint();
        this.p2 = new MyPoint(1, 1);
        this.p3 = new MyPoint(2, 5);
    }

    Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

//    public double getArea() {
//
//    }
//
//    public double getPerimeter() {
//
//    }
//
//    public boolean contains(MyPoint p) {
//
//    }
//
//    public boolean contains(Triangle2D t) {
//
//    }
//
//    public boolean overlaps(Triangle2D t) {
//
//    }
}
