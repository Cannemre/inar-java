package week_09.assignments;

import week_07.assignments.Question_07_16;

public class Question_09_06 {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 200000);
        }
        Stopwatch time = new Stopwatch();
        time.start();
        Question_07_16.sort(numbers);
        time.stop();
        System.out.println("The execution time of sorting 100.000 numbers using selection sort: " + time.getElapsedTime() + " milliseconds");
    }
}
