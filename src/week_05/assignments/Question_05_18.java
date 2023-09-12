package week_05.assignments;

public class Question_05_18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int b = 0; b <= 30; b++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 6; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int b = 0; b <= 30; b++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            for (int k = 6 - i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int b = 0; b <= 30; b++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            for (int k = 2; k <= i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}