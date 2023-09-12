package week_05.assignments;

public class Question_05_27 {
    public static void main(String[] args) {
        int iCount = 0;
        int leapYear = 0;
        for (int i = 101; i < 2100; i++) {
            leapYear += 6;
            if (leapYear % 24 == 0) {
                iCount++;
                System.out.print(i + " ");
                if (iCount % 10 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}


