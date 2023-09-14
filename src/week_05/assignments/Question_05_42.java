package week_05.assignments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the commission sought: ");
        double commission = input.nextDouble();
        double salary = 0;
        double sales;
        do {
            salary += 0.1;
            if (salary <= 5000) {
                sales = salary * 0.08;
            } else if (salary <= 10000) {
                sales = 5000 * 0.08 + (salary - 5000) * 0.1;
            } else {
                sales = 5000 * 0.08 + 5000 * 0.1 + (salary - 10000) * 0.12;
            }
        } while (sales < 2000);
        System.out.println("Minimum sales to earn $" + commission + ": $" + Math.round(salary));
    }
}
