package week_05.assignments;

public class Question_05_24 {
    public static void main(String[] args) {
        double total = 0;
        double j = 3;
        for (int i = 1; i <= 97; i += 2) {
            total += i / j;
            j += 2;
        }
        System.out.println("Sum of the series: " + total);
    }
}
