package week_13.assignments.Question_13_04;


public class Question_13_04 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java Question_13_04 monthNumber year");
            System.exit(1);
        }
        System.out.println("\t\t" + getMonthName(Integer.parseInt(args[0])) + "\t" + Integer.parseInt(args[1]));
        System.out.println("---------------------------------------------");
        System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat\n");
        getMonthBody(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
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
        return switch (n) {
            case 1 -> "January ";
            case 2 -> "February ";
            case 3 -> "March ";
            case 4 -> "April ";
            case 5 -> "May ";
            case 6 -> "June ";
            case 7 -> "July ";
            case 8 -> "August ";
            case 9 -> "September ";
            case 10 -> "October ";
            case 11 -> "November ";
            case 12 -> "December ";
            default -> "";
        };
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
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    public static int yearOfTheCentury(int year) {
        return year % 100;
    }

    public static int century(int year) {
        return year / 100;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
