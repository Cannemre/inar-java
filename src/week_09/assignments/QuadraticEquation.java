package week_09.assignments;

public class QuadraticEquation {
    private final int a;
    private final int b;
    private final int c;

    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b,2) - (4 * a * c);
    }

    public double getRoot1() {
        return (- b + (Math.sqrt(getDiscriminant()))) / (2 * a);
    }

    public double getRoot2() {
        return (- b - (Math.sqrt(getDiscriminant()))) / (2 * a);
    }
}
