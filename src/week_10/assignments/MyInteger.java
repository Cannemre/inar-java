package week_10.assignments;

public class MyInteger {
    int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger integer) {
        return integer.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger integer) {
        return integer.value % 2 != 0;
    }

    public static boolean isPrime(MyInteger integer) {
        for (int i = 2; i <= integer.value / 2; i++) {
            if (integer.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int a) {
        return a == this.value;
    }

    public boolean equals(MyInteger integer) {
        return integer.getValue() == this.value;
    }

    public static int parseInt(String string) {
        return Integer.parseInt(string);
    }

    public static int parseInt(char[] array) {
        String string = "";
        for (char c : array) {
            string += c;
        }
        return Integer.parseInt(string);
    }
}
