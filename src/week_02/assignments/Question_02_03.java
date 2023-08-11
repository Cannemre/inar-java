package week_02.assignments;

import java.util.Scanner;

public class Question_02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet;
        double meters;
        System.out.println(" Enter a value for feet: ");
        feet = input.nextDouble();
        meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
