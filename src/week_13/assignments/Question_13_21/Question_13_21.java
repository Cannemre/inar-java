package week_13.assignments.Question_13_21;

import week_13.assignments.Question_13_14.Rational;

import java.util.Scanner;

public class Question_13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        Rational a = new Rational(input.nextLong(), 1);
        Rational b = new Rational(input.nextLong(), 1);
        Rational c = new Rational(input.nextLong(), 1);
        Rational h = new Rational(-b.getNumerator(), 2 * a.getNumerator());
        Rational k = (a.multiply(h.multiply(h)).add(b.multiply(h))).add(c);
        System.out.println("h is " + h + " k is " + k);
    }
}
