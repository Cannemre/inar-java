package week_06.assignments;

public class Question_06_12 {
    public static void main(String[] args) {
        printChars('1','Z',10);
    }
    public static void printChars (char ch1, char ch2, int numberPerLine) {
        int counter = 0;
        for (char i = ch1; i <= ch2 ; i++) {
            System.out.print(i + " ");
            counter++;
            if (counter % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
