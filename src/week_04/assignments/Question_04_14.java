package week_04.assignments;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letterGrade = input.nextLine();
        char letterGradeCh = letterGrade.charAt(0);
        switch (letterGradeCh) {
            case 'A', 'a': System.out.println("The numeric value for grade " + letterGradeCh + " is 4"); break;
            case 'B', 'b': System.out.println("The numeric value for grade " + letterGradeCh + " is 3"); break;
            case 'C', 'c': System.out.println("The numeric value for grade " + letterGradeCh + " is 2"); break;
            case 'D', 'd': System.out.println("The numeric value for grade " + letterGradeCh + " is 1"); break;
            case 'F', 'f': System.out.println("The numeric value for grade " + letterGradeCh + " is 0"); break;
            default: System.out.println(letterGradeCh + " is an invalid grade");
        }

    }
}
