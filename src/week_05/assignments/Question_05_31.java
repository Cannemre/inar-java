package week_05.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double result = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double yield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();
        System.out.println("Month   CD Value");
        for (int i = 1; i <= months; i++) {
            result = result + result * yield / 1200;
            if (i > 9) {
                System.out.printf("%d      %.2f", i, result);
            } else {
                System.out.printf("%d       %.2f", i, result);
            }
            System.out.println();
        }
    }
}
