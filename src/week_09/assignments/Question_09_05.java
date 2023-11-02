package week_09.assignments;

import java.util.GregorianCalendar;


public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(System.currentTimeMillis());
        displayCalendar(date);
        date.setTimeInMillis(1234567898765L);
        System.out.println("After setTime: ");
        displayCalendar(date);
    }

    public static void displayCalendar(GregorianCalendar date) {
        System.out.println("Current year: " + date.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + date.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
