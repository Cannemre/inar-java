package week_06.assignments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }
    public static int reverse (int number) {
        String str = Integer.toString(number);
        String newStr = "";
        int reverseNum;
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        reverseNum = Integer.parseInt(newStr);
        return reverseNum;
    }
}
