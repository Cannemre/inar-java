package week_05.assignments;

public class Question_05_15 {
    public static void main(String[] args) {
        int chNumber = 0;
        for (int i = 33; i < 127; i++) {
            chNumber++;
            char ch = (char) (i);
            System.out.print(ch + " ");
            if (chNumber % 10 == 0) {
                System.out.print("\n");
            }
        }
    }
}
