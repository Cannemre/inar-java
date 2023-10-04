package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] scoreList = new int[numberOfStudents];
        int max = 0;
        String grade;
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scoreList[i] = input.nextInt();
            if (scoreList[i] > max) {
                max = scoreList[i];
            }
        }
        for (int i = 0; i < numberOfStudents; i++) {
            if (scoreList[i] >= (max - 10)) {
                grade = "A";
            } else if (scoreList[i] >= (max - 20)) {
                grade = "B";
            } else if (scoreList[i] >= (max - 30)) {
                grade = "C";
            } else if (scoreList[i] >= (max - 40)) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Students " + i + " score is " + scoreList[i] + " and grade is " + grade);
        }

    }
}
