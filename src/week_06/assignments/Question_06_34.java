package week_06.assignments;

import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();
        System.out.println("\t\t\t" + getMonthName(month) + "\t" + year);
        System.out.println("---------------------------------------------");
        System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        System.out.println();
        getMonthBody(month,year);
    }

    public static void getMonthBody(int month, int year) {
        int q = 1;
        int startDay = dayOfTheWeek(month, year, q);
        int dayOfTheMonth = dayOfTheMonths(month, year);
        if (startDay == 1) {
            for (int i = 1; i <= dayOfTheMonth; i++) {
                System.out.printf("%6d", i);
                if (i % 7 == 0) {
                    System.out.println();
                }
            }
        } else if (startDay == 2) {
            for (int i = 1; i <= dayOfTheMonth; i++) {
                if (i == 1) {
                    System.out.printf("%12d", i);
                } else {
                    System.out.printf("%6d", i);
                }
                if (i == 6 || i == 13 || i == 20 || i == 27 || i == 34) {
                    System.out.println();
                }
            }
        } else if (startDay == 3) {
            for (int i = 1; i <= dayOfTheMonth; i++) {
                if (i == 1) {
                    System.out.printf("%18d", i);
                } else {
                    System.out.printf("%6d", i);
                }
                if (i == 5 || i == 12 || i == 19 || i == 26 || i == 33) {
                    System.out.println();
                }
            }
        } else if (startDay == 4) {
            for (int i = 1; i <= dayOfTheMonth; i++) {
                if (i == 1) {
                    System.out.printf("%24d", i);
                } else {
                    System.out.printf("%6d", i);
                }
                if (i == 4 || i == 11 || i == 18 || i == 25 || i == 32) {
                    System.out.println();
                }
            }
        } else if (startDay == 5) {
            for (int i = 1; i <= dayOfTheMonth; i++) {
                if (i == 1) {
                    System.out.printf("%30d", i);
                } else {
                    System.out.printf("%6d", i);
                }
                if (i == 3 || i == 10 || i == 17 || i == 24 || i == 31) {
                    System.out.println();
                }
            }
        } else if (startDay == 6) {
            for (int i = 1; i <= dayOfTheMonth; i++) {
                if (i == 1) {
                    System.out.printf("%36d", i);
                } else {
                    System.out.printf("%6d", i);
                }
                if (i == 2 || i == 9 || i == 16 || i == 23 || i == 30 || i == 37) {
                    System.out.println();
                }
            }
        } else {
            for (int i = 1; i <= dayOfTheMonth; i++) {
                if (i == 1) {
                    System.out.printf("%42d", i);
                } else {
                    System.out.printf("%6d", i);
                }
                if (i == 1 || i == 8 || i == 15 || i == 22 || i == 29 || i == 36) {
                    System.out.println();
                }
            }
        }
    }

    public static String getMonthName(int n) {
        String monthName = "";
        switch (n) {
            case 1: monthName = "January ";break;
            case 2: monthName = "February ";break;
            case 3: monthName = "March ";break;
            case 4: monthName = "April ";break;
            case 5: monthName = "May ";break;
            case 6: monthName = "June ";break;
            case 7: monthName = "July ";break;
            case 8: monthName = "August ";break;
            case 9: monthName = "September ";break;
            case 10: monthName = "October ";break;
            case 11: monthName = "November ";break;
            case 12: monthName = "December ";break;
        }
        return monthName;
    }

    public static int dayOfTheWeek(int months, int year, int q) {
        if (months == 1 || months == 2) {
            return (q + (26 * (months + 13) / 10) + yearOfTheCentury(year - 1) + yearOfTheCentury(year - 1) / 4 + century(year - 1) / 4 + 5 * century(year - 1)) % 7;
        } else {
            return (q + (26 * (months + 1) / 10) + yearOfTheCentury(year) + yearOfTheCentury(year) / 4 + century(year) / 4 + 5 * century(year)) % 7;
        }
    }

    public static int dayOfTheMonths(int month, int year) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if (Question_06_33.isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    public static int yearOfTheCentury(int year) {
        return year % 100;
    }

    public static int century (int year) {
        return year / 100;
    }
}
