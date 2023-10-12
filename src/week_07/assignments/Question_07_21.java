package week_07.assignments;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberBallsToDrop = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();
        System.out.println();
        int control = 0;
        int[] slotNumberCount = new int[numberOfSlots];
        while (control < numberBallsToDrop) {
            int[] list = new int[numberOfSlots - 1];
            int random;
            int slotNumber;
            for (int i = 0; i < list.length; i++) {
                random = (int) (Math.random() * 2);
                list[i] = random;
            }
            slotNumber = whichSlot(list);
            String[] choose = new String[numberOfSlots - 1];
            newList(list, choose);
            displayArray(choose);
            slotNumberCount[slotNumber]++;
            control++;
        }
        System.out.println();
        displayBuildup(slotNumberCount, numberOfSlots, numberBallsToDrop);
    }

    public static int whichSlot(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static void newList(int[] list, String[] strList) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                strList[i] = "L";
            } else {
                strList[i] = "R";
            }
        }
    }

    public static void displayArray(String[] array) {
        for (String s : array) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static void displayBuildup(int[] slotNumberCount, int numberOfSlots, int numberBallsToDrop) {
        String[] buildup = new String[numberOfSlots];
        int max = slotNumberCount[0];
        for (int j : slotNumberCount) {
            if (max < j) {
                max = j;
            }
        }
        for (int i = 0; i < numberBallsToDrop - max; i++) {
            System.out.println();
        }
        while (numberBallsToDrop > 0) {
            for (int j : slotNumberCount) {
                if (max < j) {
                    max = j;
                }
            }
            for (int i = 0; i < slotNumberCount.length; i++) {
                if (slotNumberCount[i] == max) {
                    buildup[i] = "O";
                    slotNumberCount[i]--;
                } else {
                    buildup[i] = " ";
                }
            }
            displayArray(buildup);
            numberBallsToDrop--;
            max = 1;
        }
    }
}