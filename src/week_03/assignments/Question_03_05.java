package week_03.assignments;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter today's day (Sunday is 0, Monday is 1, ..., and Saturday is 6): ");
        int day = input.nextInt();
        if (day > 6) {
            System.out.println(" Invalid day number !");
            System.exit(6);
        }
        System.out.println(" Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        int futureDay = elapsed % 7;
        if (day == 0) {
            if (futureDay == 0) {
                System.out.println(" Today is Sunday and the future day is Sunday ");
            }
            if (futureDay == 1) {
                System.out.println(" Today is Sunday and the future day is Monday ");
            }
            if (futureDay == 2) {
                System.out.println(" Today is Sunday and the future day is Tuesday ");
            }
            if (futureDay == 3) {
                System.out.println(" Today is Sunday and the future day is Wednesday ");
            }
            if (futureDay == 4) {
                System.out.println(" Today is Sunday and the future day is Thursday ");
            }
            if (futureDay == 5) {
                System.out.println(" Today is Sunday and the future day is Friday ");
            }
            if (futureDay == 6) {
                System.out.println(" Today is Sunday and the future day is Saturday ");
            }
        }
        if (day == 1) {
            if (futureDay == 0) {
                System.out.println(" Today is Monday and the future day is Monday ");
            }
            if (futureDay == 1) {
                System.out.println(" Today is Monday and the future day is Tuesday ");
            }
            if (futureDay == 2) {
                System.out.println(" Today is Monday and the future day is Wednesday ");
            }
            if (futureDay == 3) {
                System.out.println(" Today is Monday and the future day is Thursday ");
            }
            if (futureDay == 4) {
                System.out.println(" Today is Monday and the future day is Friday ");
            }
            if (futureDay == 5) {
                System.out.println(" Today is Monday and the future day is Saturday ");
            }
            if (futureDay == 6) {
                System.out.println(" Today is Monday and the future day is Sunday ");
            }
        }
        if (day == 2) {
            if (futureDay == 0) {
                System.out.println(" Today is Tuesday and the future day is Tuesday ");
            }
            if (futureDay == 1) {
                System.out.println(" Today is Tuesday and the future day is Wednesday ");
            }
            if (futureDay == 2) {
                System.out.println(" Today is Tuesday and the future day is Thursday ");
            }
            if (futureDay == 3) {
                System.out.println(" Today is Tuesday and the future day is Friday ");
            }
            if (futureDay == 4) {
                System.out.println(" Today is Tuesday and the future day is Saturday ");
            }
            if (futureDay == 5) {
                System.out.println(" Today is Tuesday and the future day is Sunday ");
            }
            if (futureDay == 6) {
                System.out.println(" Today is Tuesday and the future day is Monday ");
            }
        }
        if (day == 3) {
            if (futureDay == 0) {
                System.out.println(" Today is Wednesday and the future day is Wednesday ");
            }
            if (futureDay == 1) {
                System.out.println(" Today is Wednesday and the future day is Thursday ");
            }
            if (futureDay == 2) {
                System.out.println(" Today is Wednesday and the future day is Friday ");
            }
            if (futureDay == 3) {
                System.out.println(" Today is Wednesday and the future day is Saturday ");
            }
            if (futureDay == 4) {
                System.out.println(" Today is Wednesday and the future day is Sunday ");
            }
            if (futureDay == 5) {
                System.out.println(" Today is Wednesday and the future day is Monday ");
            }
            if (futureDay == 6) {
                System.out.println(" Today is Wednesday and the future day is Tuesday ");
            }
        }
        if (day == 4) {
            if (futureDay == 0) {
                System.out.println(" Today is Thursday and the future day is Thursday ");
            }
            if (futureDay == 1) {
                System.out.println(" Today is Thursday and the future day is Friday ");
            }
            if (futureDay == 2) {
                System.out.println(" Today is Thursday and the future day is Saturday ");
            }
            if (futureDay == 3) {
                System.out.println(" Today is Thursday and the future day is Sunday ");
            }
            if (futureDay == 4) {
                System.out.println(" Today is Thursday and the future day is Monday ");
            }
            if (futureDay == 5) {
                System.out.println(" Today is Thursday and the future day is Tuesday ");
            }
            if (futureDay == 6) {
                System.out.println(" Today is Thursday and the future day is Wednesday ");
            }
        }
        if (day == 5) {
            if (futureDay == 0) {
                System.out.println(" Today is Friday and the future day is Friday ");
            }
            if (futureDay == 1) {
                System.out.println(" Today is Friday and the future day is Saturday ");
            }
            if (futureDay == 2) {
                System.out.println(" Today is Friday and the future day is Sunday ");
            }
            if (futureDay == 3) {
                System.out.println(" Today is Friday and the future day is Monday ");
            }
            if (futureDay == 4) {
                System.out.println(" Today is Friday and the future day is Tuesday ");
            }
            if (futureDay == 5) {
                System.out.println(" Today is Friday and the future day is Wednesday ");
            }
            if (futureDay == 6) {
                System.out.println(" Today is Friday and the future day is Thursday ");
            }
        }
        if (day == 6) {
            if (futureDay == 0) {
                System.out.println(" Today is Saturday and the future day is Saturday ");
            }
            if (futureDay == 1) {
                System.out.println(" Today is Saturday and the future day is Sunday ");
            }
            if (futureDay == 2) {
                System.out.println(" Today is Saturday and the future day is Monday ");
            }
            if (futureDay == 3) {
                System.out.println(" Today is Saturday and the future day is Tuesday ");
            }
            if (futureDay == 4) {
                System.out.println(" Today is Saturday and the future day is Wednesday ");
            }
            if (futureDay == 5) {
                System.out.println(" Today is Saturday and the future day is Thursday ");
            }
            if (futureDay == 6) {
                System.out.println(" Today is Saturday and the future day is Friday ");
            }
        }
    }
}