package week_06.assignments;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount      Commission");
        System.out.println("----------------------------");
        for (int i = 10000; i <= 100000 ; i+=5000) {
            if (i < 100000) {
                System.out.println(i + "             " + salesAmount(i));
            } else {
                System.out.println(i + "            " + salesAmount(i));
            }
        }
    }
    public static double salesAmount (int i) {
        double total = 0;
        if (i <= 5000) {
            total += 5000 * 0.08;
        } else if (i <= 10000) {
            total += 5000 * 0.08 + (i - 5000) * 0.1;
        } else {
            total += 5000 * 0.08 + 5000 * 0.1 + (i - 10000) * 0.12;
        }
        return total;
    }
}
