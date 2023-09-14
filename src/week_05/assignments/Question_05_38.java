package week_05.assignments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        int decimalOrg = decimal;
        int mod;
        String result = "";
        for (int i = decimal; i > 0 ; i/=8) {
            mod = decimal % 8;
            result = mod + result;
            decimal /= 8;
        }
        System.out.println("The octal of " + decimalOrg + " is " + result);
    }
}
