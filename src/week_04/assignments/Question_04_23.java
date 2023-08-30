package week_04.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        double grossPay = hours * payRate;
        double fedTax = grossPay * federalTax;
        double staTax = grossPay * stateTax;
        double totalTax = fedTax + staTax;
        double netPay = grossPay - totalTax;
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:\n Federal Withholding (20.0%): $" + fedTax);
        System.out.println(" State Withholding (9.0%): $" + staTax);
        System.out.println(" Total Deduction: $" + totalTax);
        System.out.println("Net Pay: $" + netPay);

    }
}
