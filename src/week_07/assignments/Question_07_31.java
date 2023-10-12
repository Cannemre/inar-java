package week_07.assignments;

import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int length1 = input.nextInt();
        int[] list1 = new int[length1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int length2 = input.nextInt();
        int[] list2 = new int[length2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        System.out.print("The merged list is ");
        for (int i = 0; i < merge(list1, list2).length; i++) {
            System.out.print(merge(list1, list2)[i] + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, mergedList, 0, list1.length);
        for (int i = list1.length, j = 0; j < list2.length; i++, j++) {
            mergedList[i] = list2[j];
        }
        Question_07_16.sort(mergedList);
        return mergedList;
    }
}
