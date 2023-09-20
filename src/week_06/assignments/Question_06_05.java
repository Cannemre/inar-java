package week_06.assignments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers (double n1, double n2, double n3) {
        if (n1 < n2 && n2 < n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 < n3 && n3 < n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n2 < n1 && n1 < n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n2 < n3 && n3 < n1) {
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n3 < n1 && n1 < n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        } else if (n3 < n2 && n2 < n1) {
            System.out.println(n3 + " " + n2 + " " + n1);
        } else if (n3 < n2 && n3 < n1) {
            System.out.println(n3 + " " + n2 + " " + n1);
        } else if (n1 < n3 && n2 < n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 < n2 && n3 < n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n2 < n1 && n3 < n1) {
            System.out.println(n3 + " " + n2 + " " + n1);
        } else if (n1 < n2 && n1 < n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else {
            System.out.println(n3 + " " + n2 + " " + n1);
        }

    }
}
