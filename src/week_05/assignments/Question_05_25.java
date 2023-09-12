package week_05.assignments;

public class Question_05_25 {
    public static void main(String[] args) {


        for (int i = 10000; i <= 100000; i+= 10000) {
            double x = 0;
            double pi;
            for (int divisor = 3; divisor <= 2 * i - 1; divisor += 4) {
                x -= 1.0 / divisor;
            }
            for (int divisor = 5; divisor <= (2 * i - 1) - 2; divisor += 4) {
                x += 1.0 / divisor;
            }
            pi = 4 * (x + 1);
                System.out.println("PI value for i = " + i + " " + pi);
        }
//        double pi = 0;
//        for (int i = 1; i <= 100000; i++) {
//            if (i % 2 == 0) {
//                pi -= 1.0 / (2 * i - 1);
//            } else {
//                pi += 1.0 / (2 * i - 1);
//            }
//            if (i == 10000) {
//                System.out.println("PI value for i = 10000: " + 4 * pi);
//            } else if (i == 20000) {
//                System.out.println("PI value for i = 20000: " + 4 * pi);
//            } else if (i == 100000) {
//                System.out.println("PI value for i = 100000: " + 4 * pi);
//            }
//        }
    }
}

