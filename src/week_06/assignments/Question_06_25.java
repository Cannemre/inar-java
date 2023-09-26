package week_06.assignments;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long milliseconds = input.nextLong();
        System.out.println("hours:minutes:seconds: " + convertMillis(milliseconds));
    }

    public static String convertMillis (long millis) {
        long totalSeconds = millis / 1000;
        long totalMinutes = totalSeconds / 60;
        long newSeconds = totalSeconds % 60;
        long totalHours = totalMinutes / 60;
        long newMinutes = totalMinutes % 60;
        return totalHours + ":" + newMinutes + ":" + newSeconds;
    }
}
