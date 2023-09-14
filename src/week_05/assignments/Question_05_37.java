package week_05.assignments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        String result = "";
        int mod;
        for (int i = decimal; i > 0; i /= 2) {
            mod = decimal % 2;
            result = mod + result;
            decimal /= 2;
        }
        System.out.println("The binary value of the decimal " + decimal + " is: " + result);
    }
}
