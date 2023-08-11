package week_02.assignments;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes;
        int years;
        int days;
        System.out.println(" Enter the number of minutes: ");
        minutes = input.nextInt();
        years = minutes / 525600;
        days = (minutes / 1440) % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
