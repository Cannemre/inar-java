package week_05.assignments;

public class Question_05_11 {
    public static void main(String[] args) {
        int number = 100;
        int correctNumber;
        int correctNumberCount = 0;
        while (number <= 200) {
            if (number % 5 == 0 ^ number % 6 == 0) {
                correctNumberCount++;
                correctNumber = number;
                System.out.print(correctNumber + " ");
                if (correctNumberCount % 10 == 0) {
                    System.out.print("\n");
                }
            }
            number++;
        }
    }
}