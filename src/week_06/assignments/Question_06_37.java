package week_06.assignments;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();
        System.out.println(number + " formatted to width " + width + ": " + format(number,width));
    }

    public static String format(int number, int width) {
        String numberStr = number + "";
        String formattedNumber = "";
        for (int i = 1; i <= width - numberStr.length(); i++) {
            formattedNumber += "0";
        }
        formattedNumber += numberStr;
        return formattedNumber;
    }
}
