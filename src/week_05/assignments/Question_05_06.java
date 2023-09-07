package week_05.assignments;

public class Question_05_06 {
    public static void main(String[] args) {
        System.out.println("Miles        Kilometers      |      Kilometers        Miles");
        int km = 20;
        for (int i = 1; i < 11; i++) {
            double mil = km / 1.609;
            double j = i * 1.609;
            km += 5;
            if (i < 7) {
                System.out.printf("%d            %.3f           |      %d                %.3f\n", i, j, km, mil);
            } else if (i < 10) {
                System.out.printf("%d            %.3f          |      %d                %.3f\n", i, j, km, mil);
            } else {
                System.out.printf("%d           %.3f\n", i, j);
            }
        }
    }
}
