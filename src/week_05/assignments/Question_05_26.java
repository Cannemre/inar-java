package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double e = 1;
        double j = 1;
        for (int i = 1; i <= 100000; i++) {
            j = j * i;
            e += 1 / j;
            if (i == 10000) {
                System.out.println("e at i = 10000 is " + e);
            } else if (i == 20000) {
                System.out.println("e at i = 10000 is " + e);
            } else if (i == 100000) {
                System.out.println("e at i = 10000 is " + e);
            }
        }
    }
}


