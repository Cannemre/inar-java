package week_05.assignments;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int firstDay = input.nextInt();
        int day = 0;
        String dayName;
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                day = firstDay;
            } else if (i == 5 || i == 7 || i == 10 || i == 12) {
                day = (day + 30) % 7;
            } else if (i == 3) {
                if (year % 4 == 0) {
                day = (day + 29) % 7;
                } else {
                day = (day + 28) % 7;
                }
            } else {
                day = (day + 31) % 7;
            }
            if (day == 1) {
                dayName = "Monday";
            } else if (day == 2) {
                dayName = "Tuesday";
            } else if (day == 3) {
                dayName = "Wednesday";
            } else if (day == 4) {
                dayName = "Thursday";
            } else if (day == 5) {
                dayName = "Friday";
            } else if (day == 6) {
                dayName = "Saturday";
            } else {
                dayName = "Sunday";
            }
            switch (i) {
                case 1: System.out.println("January 1, " + year + " is " + dayName); break;
                case 2: System.out.println("February 1, " + year + " is " + dayName); break;
                case 3: System.out.println("March 1, " + year + " is " + dayName); break;
                case 4: System.out.println("April 1, " + year + " is " + dayName); break;
                case 5: System.out.println("May 1, " + year + " is " + dayName); break;
                case 6: System.out.println("June 1, " + year + " is " + dayName); break;
                case 7: System.out.println("July 1, " + year + " is " + dayName); break;
                case 8: System.out.println("August 1, " + year + " is " + dayName); break;
                case 9: System.out.println("September 1, " + year + " is " + dayName); break;
                case 10: System.out.println("October 1, " + year + " is " + dayName); break;
                case 11: System.out.println("November 1, " + year + " is " + dayName); break;
                case 12: System.out.println("December 1, " + year + " is " + dayName);
            }
        }
    }
}
