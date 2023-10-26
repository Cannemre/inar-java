package week_08.assignments;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        int[][] list1 = new int[3][3];
        System.out.print("Enter list1: ");
        getFromUser(list1);
        int[][] list2 = new int[3][3];
        System.out.print("Enter list2: ");
        getFromUser(list2);
        if (equals(list1, list2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static void getFromUser(int[][] list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = input.nextInt();
            }
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean result = false;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] == m2[i][j]) {
                    result = true;
                } else {
                    return false;
                }
            }
        }
        return result;
    }
}
