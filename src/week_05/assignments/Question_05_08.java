package week_05.assignments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int max = 0;
        String name = "";

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student : " + (i + 1));
            System.out.print("   Name : ");
            String studentName = input.next();
            System.out.print("  Score : ");
            int score = input.nextInt();
            if (score > max) {
                max = score;
                name = studentName;
            }
        }
        System.out.println("Student with the highest score: " + name);
    }
}