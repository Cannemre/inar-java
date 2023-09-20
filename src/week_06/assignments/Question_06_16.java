package week_06.assignments;

public class Question_06_16 {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println("Year      Day in year");
        while (year <= 2020) {
            System.out.println(year + "         " + numberOfDaysInAYear(year));
            year++;
        }

    }
    public static int numberOfDaysInAYear (int year) {
        int daysInAYear;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            daysInAYear = 366;
        } else {
            daysInAYear = 365;
        }
        return daysInAYear;
    }
}
