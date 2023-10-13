package week_07.assignments;

import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int length = input.nextInt();
        int[] originalList = new int[length];
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.arraycopy(list, 0, originalList, 0, list.length);
        int newPivotIndex = partition(list);
        int pivot = originalList[0];
        for (int i = 0; i < newPivotIndex; i++) {
            for (int j = i + 1; j < originalList.length; j++) {
                if (originalList[j] < pivot) {
                    int temp = originalList[j];
                    originalList[j] = originalList[i];
                    originalList[i] = temp;
                    break;
                }
            }
        }
        for (int i = 0; i < originalList.length; i++) {
            if (originalList[i] == pivot) {
                if (i != newPivotIndex) {
                    int temp = originalList[i];
                    originalList[i] = originalList[newPivotIndex];
                    originalList[newPivotIndex] = temp;
                }

            }
            System.out.print("After the partition, the list is ");
            for (int j : originalList) {
                System.out.print(j + " ");
            }
        }
    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int index = 0;
        Question_07_16.sort(list);
        for (int i = 0; i < list.length; i++) {
            if (list[i] == pivot) {
                index = i;
            }
        }
        return index;
    }
}
