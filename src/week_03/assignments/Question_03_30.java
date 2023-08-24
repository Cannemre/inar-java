package week_03.assignments;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the time zone offset to GMT: ");
        int gmt = input.nextInt();
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours + gmt) % 24;
        if (currentHours / 12 == 0) {
            System.out.println(" The current time is " + currentHours % 12 + ":" + currentMinutes + ":" + currentSeconds + " AM");
        } else if (currentHours / 12 == 1) {
            System.out.println(" The current time is " + currentHours % 12 + ":" + currentMinutes + ":" + currentSeconds + " PM");
        } else {
            System.out.println(" The current time is " + currentHours % 12 + ":" + currentMinutes + ":" + currentSeconds + " AM");

        }
    }
}