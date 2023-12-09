package week_13.assignments.Question_13_14;

public class Question_13_14 {
    public static void main(String[] args) {
        Rational rational = new Rational(2,1);
        Rational rational2 = new Rational(2,3);
        System.out.println(rational + " + " + rational2 + " = " + rational.add(rational2));
        System.out.println(rational + " - " + rational2 + " = " + rational.subtract(rational2));
        System.out.println(rational + " * " + rational2 + " = " + rational.multiply(rational2));
        System.out.println(rational + " / " + rational2 + " = " + rational.divide(rational2));
        System.out.println(rational2 + " is " + rational2.doubleValue());
    }
}
