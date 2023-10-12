package week_07.assignments;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] list = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        sort(list);
        for (double j : list) {
            System.out.print(j + " ");
        }
    }

    public static void sort(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            double currentMax = array[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < array[j]) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                array[currentMaxIndex] = array[i];
                array[i] = currentMax;
            }
        }
    }
}
