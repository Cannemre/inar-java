package week_05.assignments;

public class Question_05_39 {
    public static void main(String[] args) {
        double salary = 5000;
        double sales = 0;
        while (salary < 30000) {
            if (sales <= 5000) {
                salary = 5000 + sales * 0.08;
            } else if (sales <= 10000) {
                salary = 5000 + (5000 * 0.08) + (sales - 5000) * 0.1;
            } else {
                salary = 5000 + (5000 * 0.08) + 5000 * 0.1 + (sales - 10000) * 0.12;
            }
            sales += 0.1;
        }
        System.out.printf("Minimum sales to earn $30,000: $%.2f", sales);
    }
}
