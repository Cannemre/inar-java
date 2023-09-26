package week_06.assignments;

import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long cardNumber = input.nextLong();
        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid");
        } else {
            System.out.println(cardNumber + " is invalid");
        }

    }

    public static boolean isValid(long number) {
        boolean valid = false;
        int sumDigits = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        if (sumDigits % 10 == 0 && 13 <= getSize(number) && getSize(number) <= 16 && prefixMatched(number)) {
            valid = true;
        }
        return valid;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        long digit;
        int sum = 0;
        while (number != 0) {
            number /= 10;
            digit = getDigit((int) (number % 10));
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int getDigit(int number) {
        int digit;
        if (number * 2 > 9) {
            digit = ((number * 2) % 10) + ((number * 2) / 10);
        } else {
            digit = number * 2;
        }
        return digit;
    }

    public static int sumOfOddPlace(long number) {
        int digit;
        int sum = 0;
        while (number != 0) {
            digit = (int) (number % 10);
            sum += digit;
            number /= 100;
        }
        return sum;
    }

    public static boolean prefixMatched(long number) {
        boolean prefixMatch = false;
        if (getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 || getPrefix(number, 1) == 6) {
            prefixMatch = true;
        } else if (getPrefix(number, 2) == 37) {
            prefixMatch = true;
        }
        return prefixMatch;
    }

    public static int getSize(long d) {
        String number = d + "";
        return number.length();
    }

    public static long getPrefix(long number, int k) {
        if (k > getSize(number)) {
            while (number >= 100) {
                number /= 10;
            }
        } else {
            while (number >= 10) {
                number /= 10;
            }
        }
        return number;
    }
}

