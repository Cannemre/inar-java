package week_14.assignments.Question_14_12;

import java.util.Scanner;

public class Question_14_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        char result = ' ';
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char tempResult = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == tempResult) {
                    tempResult = str.charAt(i + 1);
                    break;
                }
            }
            if (tempResult == str.charAt(i)) {
                result = str.charAt(i);
                index = i;
                break;
            }
        }
        if (result == ' ') {
            System.out.println("-1");
        } else {
            System.out.println("The first non-repeating character is '" + result + "': " + (index + 1) + ". character of the string.");
        }
    }
}
