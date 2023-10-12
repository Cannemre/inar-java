package week_07.assignments;

import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int newPivotIndex = partition(list);
        System.out.print("After the partition, the list is ");
        for (int j : list) {
            System.out.print(j + " ");
        }

    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int index = 0;
        for (int i = 1; i < list.length; i++) {
            if (pivot >= list[i]) {
                int temp = list[index];
                list[index] = list[i];
                list[i] = temp;
                index = i;
            } else {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] > list[j]) {
                        int temp2 = list[i];
                        list[i] = list[j];
                        list[j] = temp2;
                    }
                }
            }
        }
        return index;
    }
}
