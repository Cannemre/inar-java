package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentNumber = input.nextInt();
        String[] names = new String[studentNumber];
        int[] scores = new int[studentNumber];
        for (int i = 1; i <= studentNumber; i++) {
            System.out.print("Student " + i + ": ");
            String name = input.next();
            names[i - 1] = name;
            System.out.print("Score: ");
            int score = input.nextInt();
            scores[i - 1] = score;
        }
        sort(scores, names);
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void sort(int[] array, String[] names) {
        for (int i = 0; i < array.length - 1; i++) {
            String currentMinName = names[i];
            int currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMin < array[j]) {
                    currentMin = array[j];
                    currentMinName = names[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                names[currentMinIndex] = names[i];
                array[i] = currentMin;
                names[i] = currentMinName;
            }
        }
    }
}
