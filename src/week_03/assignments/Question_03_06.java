package week_03.assignments;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter weight in pounds: ");
        int pounds = input.nextInt();
        System.out.println(" Enter feet: ");
        int feet = input.nextInt();
        System.out.println(" Enter inches: ");
        int inches = input.nextInt();
        double kilograms = pounds * 0.45359237;
        double meters = (inches * 0.0254) + (feet * 0.3048);
        double bmi = kilograms / Math.pow(meters, 2);
        System.out.println(" BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println(" Underweight ");
        }
        else if (bmi < 25) {
            System.out.println(" Normal ");
            }
        else if (bmi < 30) {
            System.out.println(" Overweight ");
        }
        else {
            System.out.println(" Obese ");
        }
    }
}
