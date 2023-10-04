package week_07.assignments;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 10);
            numbers[randomNumber]++;
        }
        System.out.println("Count for each number between 0 and 9:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "s: " + numbers[i]);
        }
    }
}
