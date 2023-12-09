package week_14.assignments.Question_14_25;

import java.util.ArrayList;

public class Question_14_25 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            nums.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("Generated ArrayList:\n" + nums);
        boolean result = false;
        int targetSum = (int) (Math.random() * 100 + 1);
        System.out.println("Generated Target Sum: " + targetSum);
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == targetSum) {
                    result = true;
                    System.out.println("Numbers are: " + nums.get(i) + ", " + nums.get(j));
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        System.out.println("Result: " + result);
    }
}
