package week_10.assignments;

import java.util.GregorianCalendar;

public class MyDate {
    int year;
    int month;
    int day;

    MyDate() {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(System.currentTimeMillis());
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH) + 1;
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH) + 1;
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH) + 1;
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
