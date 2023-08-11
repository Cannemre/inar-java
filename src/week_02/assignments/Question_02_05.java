package week_02.assignments;

import java.util.Scanner;

public class Question_02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal;
        double gratuityRate;
        double gratuity;
        double total;
        System.out.println(" Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        gratuity = subtotal * 15 / 100;
        total = subtotal * 15 / 100 + subtotal;
        System.out.println(" The gratuity is $" + gratuity + " and total is " + total);

    }
}
