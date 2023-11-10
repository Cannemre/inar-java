package week_10.assignments;

import java.util.Date;

public class Time {
    int hour;
    int minute;
    int second;

    Time() {
        Date date = new Date(System.currentTimeMillis());
        this.hour = date.getHours();
        this.minute = date.getMinutes();
        this.second = date.getSeconds();
    }

    Time(long millisecond) {
        Date date = new Date(millisecond);
        this.hour = date.getHours();
        this.minute = date.getMinutes();
        this.second = date.getSeconds();
    }

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapsedTime) {
        Date date = new Date(elapsedTime);
        this.hour = date.getHours();
        this.minute = date.getMinutes();
        this.second = date.getSeconds();
    }

    public static String toString(Time time) {
        return time.hour + ":" + time.minute + ":" + time.second;
    }

}
