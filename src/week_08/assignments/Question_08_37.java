package week_08.assignments;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] capitals = {{"Turkey", "Ankara" },
                {"France", "Paris" },
                {"Germany", "Berlin" },
                {"Russia", "Moscow" },
                {"Austria", "Vienna" },
                {"UK", "London" },
                {"EGYPT", "Cairo" },
                {"Italy", "Rome" },
                {"Spain", "Madrid" },
                {"China", "Beijing" }};
        int counter = 0;
        for (int i = 0; i < capitals.length; i++) {
            System.out.print("What is the capital of " + capitals[i][0] + "? ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(capitals[i][1])) {
                System.out.println("Your answer is correct!");
                counter++;
            } else {
                System.out.println("The correct answer should be " + capitals[i][1] + "!");
            }
        }
        System.out.println("The correct count is " + counter);
    }
}
