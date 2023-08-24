package week_03.assignments;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print(" Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();
        if (convert == 0) {
            System.out.print(" Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();
            double dollarToYuan = dollarAmount * exchangeRate;
            System.out.println("$" + dollarAmount + " is " + dollarToYuan + " yuan ");
        } else if (convert == 1) {
            System.out.print(" Enter the RMB amount: ");
            double rmbAmount = input.nextDouble();
            double yuanToDollar = rmbAmount / exchangeRate;
            System.out.println(rmbAmount + " yuan is $" + yuanToDollar );

        } else {
            System.out.println(" Incorrect input ! ");
        }
    }
}
