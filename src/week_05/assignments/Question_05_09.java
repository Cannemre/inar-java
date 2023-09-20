package week_05.assignments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int max = 0;
        int secondMax = 0;
        String maxName = "";
        String secondName = "";
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("Student : " + (i + 1));
            System.out.print("   Name : ");
            String studentName = input.next();
            System.out.print("  Score : ");
            int score = input.nextInt();
            if (score > max) {
                secondMax = max;
                secondName = maxName;
                max = score;
                maxName = studentName;
            } else if (score > secondMax) {
                secondMax = score;
                secondName = studentName;
            }
        }
        System.out.println("The highest scoring student: " + maxName + "\nThe second highest scoring student: " + secondName);
    }
}