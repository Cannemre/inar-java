package week_09.assignments;

public class Rectangle {
    double width;
    double height;

    Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}
