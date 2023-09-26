package week_06.assignments;

public class Question_06_24 {
    public static void main(String[] args) {
        System.out.println("Current time and date is : " + currentTime() + "   " + currentDate());
    }

    public static String currentTime() {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        return (currentHours % 12) + ":" + currentMinutes + ":" + currentSeconds + " " + ((currentHours > 12) ? "PM" : "AM");
    }

    public static String currentDate() {
        return currentDayAndMonth() + " / " + currentYear();
    }

    public static int currentYear() {
        int year = 1970;
        long totalDays = totalDaysFrom1970January();
        while (totalDays > daysInYear(year)) {
            totalDays -= daysInYear(year);
            year++;
        }
        return year;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static long totalDaysFrom1970January() {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        return totalHours / 24;
    }

    public static String currentDayAndMonth() {
        int year = 1970;
        int month = 1;
        long totalDays = totalDaysFrom1970January();
        while (totalDays > daysInMonth(month, year)) {
            if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
                totalDays -= 31;
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                totalDays -= 30;
            }
            if (month == 2) {
                if (isLeapYear(year)) {
                    totalDays -= 29;
                } else {
                    totalDays -= 28;
                }
            }
            if (month == 12) {
                year++;
                month = 0;
            }
            month++;
        }
        return (totalDays + 1) + " / " + month % 12;
    }

    public static int daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static int daysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 30;
        }
    }
}

