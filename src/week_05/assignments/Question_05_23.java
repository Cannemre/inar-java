package week_05.assignments;

public class Question_05_23 {
    public static void main(String[] args) {
        double totalLeftToRight = 0;
        for (double i = 1; i <= 50000; i++) {
            totalLeftToRight += 1 / i;
        }
        System.out.println("Summation of series left to right: " + totalLeftToRight);
        double totalRightToLeft = 0;
        for (double i = 50000; i >= 1; i--) {
            totalRightToLeft += 1 / i;
        }
        System.out.println("Summation of series right to left: " + totalRightToLeft);
        System.out.println("Summation of the series right to left - Summation of the series left to right: " + (totalRightToLeft - totalLeftToRight));
    }
}
