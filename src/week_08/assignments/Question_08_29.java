package week_08.assignments;

import static week_08.assignments.Question_08_28.getFromUser;

public class Question_08_29 {
    public static void main(String[] args) {
        int[][] list1 = new int[3][3];
        System.out.print("Enter first list: ");
        getFromUser(list1);
        int[][] list2 = new int[3][3];
        System.out.print("Enter second list: ");
        getFromUser(list2);
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[] newList1 = new int[m1.length * m1[0].length];
        int[] newList2 = new int[m2.length * m2[0].length];
        int index = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                newList1[index] = m1[i][j];
                index++;
            }
        }
        index = 0;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                newList2[index] = m2[i][j];
                index++;
            }
        }
        boolean result = false;
        for (int i = 0; i < newList1.length; i++) {
            result = false;
            for (int j = 0; j < newList2.length; j++) {
                if (newList1[i] == newList2[j]) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                return false;
            }
        }
        for (int i = 0; i < newList2.length; i++) {
            result = false;
            for (int j = 0; j < newList1.length; j++) {
                if (newList1[j] == newList2[i]) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                return false;
            }
        }
        return result;
    }
}
