package week_05.assignments;

public class Question_05_03 {
    public static void main(String[] args) {
        System.out.println("Kilograms       Pounds");
        for (int i= 1; i < 200; i+= 2) {
            double j = i * 2.2;
            if (i < 5) {
                System.out.printf("%d                  %.1f\n", i, j);
            } else if (i < 11) {
                System.out.printf("%d                 %.1f\n", i, j);
            } else if (i < 47) {
                System.out.printf("%d                %.1f\n", i, j);
            } else if (i < 101) {
                System.out.printf("%d               %.1f\n", i, j);
            } else {
                System.out.printf("%d              %.1f\n", i, j);
            }
        }
    }
}
