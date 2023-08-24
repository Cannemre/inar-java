package week_03.assignments;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the weight of the package (in pounds): ");
        double pounds = input.nextInt();
        double cost;
        if (0 < pounds && pounds <= 1) {
            cost = pounds * 3.5;
            System.out.println(" Shipping cost of package is $" + cost);
        } else if (1 < pounds && pounds <= 3) {
            cost = pounds * 5.5;
            System.out.println(" Shipping cost of package is $" + cost);
        } else if (3 < pounds && pounds <= 10) {
            cost = pounds * 8.5;
            System.out.println(" Shipping cost of package is $" + cost);
        } else if (10 < pounds && pounds <= 20) {
            cost = pounds * 10.5;
            System.out.println(" Shipping cost of package is $" + cost);
        } else {
            System.out.println(" The package cannot be shipped. ");
        }

    }
}
