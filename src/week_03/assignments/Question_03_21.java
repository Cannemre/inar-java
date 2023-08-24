package week_03.assignments;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.println(" Enter month (1-12): ");
        int month = input.nextInt();
        System.out.println(" Enter the day of the month (1-31): ");
        int dayOfTheMonth = input.nextInt();
        int j = year / 100;
        int k = year % 100;
        int day = (dayOfTheMonth + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        if (month == 1) {
            j = (year - 1) / 100;
            k = (year - 1) % 100;
            day = (dayOfTheMonth + ((26 * (13 + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        } else if (month == 2) {
            j = (year - 1) / 100;
            k = (year - 1) % 100;
            day = (dayOfTheMonth + ((26 * (14 + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        }
        switch (day) {
            case 0:
                System.out.println(" Day of the week is Saturday "); break;
            case 1:
                System.out.println(" Day of the week is Sunday "); break;
            case 2:
                System.out.println(" Day of the week is Monday "); break;
            case 3:
                System.out.println(" Day of the week is Tuesday "); break;
            case 4:
                System.out.println(" Day of the week is Wednesday "); break;
            case 5:
                System.out.println(" Day of the week is Thursday "); break;
            case 6:
                System.out.println(" Day of the week is Friday "); break;
        }
    }
}
