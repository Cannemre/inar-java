package week_05.assignments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        String newStr = "";
        int length = (str.length() - 1) + (str2.length() - 1) - Math.abs((str2.length() - 1) - (str.length() - 1));
        for (int i = 0; i <= length ; i++) {
           if (str.charAt(i) == str2.charAt(i)) {
               newStr += str.charAt(i);
           } else {
               break;
           }
        }
        if (!newStr.isEmpty()) {
            System.out.println("The common prefix is " + newStr);
        } else {
            System.out.println(str + " and " + str2 + " have no common prefix");
        }
    }
}
