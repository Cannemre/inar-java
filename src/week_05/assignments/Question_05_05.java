package week_05.assignments;

public class Question_05_05 {
    public static void main(String[] args) {
        System.out.println("Kilograms       Pounds         |         Pounds       Kilograms");
        int pound = 20;
        for (int i = 1; i < 200; i+= 2) {
            double kilogram = pound / 2.2;
            double j = i * 2.2;
            if (i < 5) {
                if (pound == 20) {
                    System.out.printf("%d                  %.1f         |         %d                %.2f\n", i, j, pound, kilogram);
                } else {
                    System.out.printf("%d                  %.1f         |         %d               %.2f\n", i, j, pound, kilogram);
                }
            } else if (i < 11) {
                System.out.printf("%d                 %.1f         |         %d               %.2f\n", i, j, pound, kilogram);
            } else if (i < 47) {
                if (pound < 135 && pound > 95) {
                    System.out.printf("%d                %.1f         |         %d              %.2f\n", i, j, pound, kilogram);
                } else {
                    System.out.printf("%d                %.1f         |         %d               %.2f\n", i, j, pound, kilogram);
                }
            } else if (i < 101) {
                if (pound < 220) {
                    System.out.printf("%d               %.1f         |         %d              %.2f\n", i, j, pound, kilogram);
                } else {
                    System.out.printf("%d               %.1f         |         %d             %.2f\n", i, j, pound, kilogram);
                }
            } else {
                System.out.printf("%d              %.1f         |         %d             %.2f\n", i, j, pound, kilogram);
            }
            pound += 5;
        }
    }
}
