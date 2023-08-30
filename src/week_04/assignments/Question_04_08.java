package week_04.assignments;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code:");
        int number = input.nextInt();
        System.out.println("The Character for ASCII code " + number + " is " + (char)number);
    }
}
