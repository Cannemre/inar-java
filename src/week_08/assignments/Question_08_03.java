package week_08.assignments;

import week_07.assignments.Question_07_17;

import java.util.Scanner;

public class Question_08_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String[] studentsNumber = new String[8];
        int[] score = new int[8];
        String[][] answers = new String[8][10];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                answers[i][j] = input.nextLine();
            }
        }
        for (int i = 0; i < answers.length; i++) {
            score[i] = correctCount(answers, key, i);
            studentsNumber[i] = "Student " + i + "'s correct count is ";
        }
        Question_07_17.sort(score, studentsNumber);
        for (int i = answers.length - 1; i >= 0; i--) {
            System.out.print(studentsNumber[i] + score[i] + "\n");
        }

    }

    public static int correctCount(String[][] answers, String[] key, int i) {
        int count = 0;
        for (int j = 0; j < answers[i].length; j++) {
            if (answers[i][j].equalsIgnoreCase(key[j])) {
                count++;
            }
        }
        return count;
    }
}

