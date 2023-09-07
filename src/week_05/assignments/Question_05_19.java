package week_05.assignments;

public class Question_05_19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = (9 - i); j >= 1; j--) {
                System.out.print("    ");
            }
            for (int k = 1; k <= Math.pow(2, (i - 1)); ) {
                if (k >= 8) {
                    System.out.print(k + "  ");
                } else {
                    System.out.print(k + "   ");
                }
                k = k * 2;
            }
            for (int l = (int) Math.pow(2, (i - 2)); l >= 1; ) {
                if (i > 1) {
                    System.out.print(l + "   ");
                }
                l = l / 2;
            }
            System.out.println();
        }
    }
}
