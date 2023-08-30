package week_04.assignments;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = input.nextInt();
        System.out.println("Enter a month:");
        String month = input.next();
        if (year % 4 == 0) {
            switch (month) {
                case "jan", "Jan", "mar", "Mar", "may", "May", "jul", "Jul", "aug", "Aug", "oct", "Oct", "dec", "Dec":
                    System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 31 days.");break;
                case "feb", "Feb":
                    System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 29 days.");break;
                case "apr", "Apr", "jun", "Jun", "sep", "Sep", "nov", "Nov":
                    System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 30 days.");break;
            }
        } else {
            switch (month) {
                case "jan", "Jan", "mar", "Mar", "may", "May", "jul", "Jul", "aug", "Aug", "oct", "Oct", "dec", "Dec":
                    System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 31 days.");break;
                case "feb", "Feb":
                    System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 28 days.");break;
                case "apr", "Apr", "jun", "Jun", "sep", "Sep", "nov", "Nov":
                    System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 30 days.");break;
            }
        }
    }
}
