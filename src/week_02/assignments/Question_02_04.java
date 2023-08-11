package week_02.assignments;

import java.util.Scanner;

public class Question_02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds;
        double kilograms;
        System.out.println(" Enter a number in pounds: ");
        pounds = input.nextDouble();
        kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

    }
}
