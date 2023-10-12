package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list length: ");
        int length = input.nextInt();
        int[] list = new int[length];
        System.out.print("Enter list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        if (isSorted(list)) {
            System.out.println("The list is already sorted!");
        } else {
            System.out.println("The list is not sorted!");
        }
    }

    public static boolean isSorted(int[] list) {
        int[] originalList = new int[list.length];
        System.arraycopy(list, 0, originalList, 0, originalList.length);
        Arrays.sort(list);
        boolean result = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == originalList[i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
