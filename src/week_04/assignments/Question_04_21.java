package week_04.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();
        char ch3 = ssn.charAt(3);
        char ch6 = ssn.charAt(6);
        if (ssn.length() != 11 && ch3 != '-' && ch6 != '-') {
            System.out.println(ssn + " is an invalid social security number");
        } else {
            System.out.println(ssn + " is a valid social security number");
        }
    }
}
