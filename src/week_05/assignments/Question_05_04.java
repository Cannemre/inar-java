package week_05.assignments;

public class Question_05_04 {
    public static void main(String[] args) {
        System.out.println("Miles        Kilometers");
        for (int i = 1; i < 11; i++) {
            double j = i * 1.609;
            if (i < 10) {
                System.out.printf("%d             %.3f\n",i, j);
            } else {
                System.out.printf("%d            %.3f\n",i, j);
            }
        }
    }
}