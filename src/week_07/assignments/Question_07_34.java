package week_07.assignments;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String str = input.nextLine();
        str = str.toLowerCase();
        String result = sort(str);
        System.out.println("Sorted form: " + result);
    }

    public static String sort(String str) {
        int[] result = new int[str.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = str.charAt(i);
        }
        Question_07_16.sort(result);
        String resultString = "";
        for (int j : result) {
            resultString += (char) j;
        }
        return resultString;
    }
}
