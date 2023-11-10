package week_10.assignments;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; i < 120; i++) {
            boolean result = true;
            for (int j = i - 1; j >= 2; j--) {
                if (i % j == 0) {
                    result = false;
                    break;
                }
            }
            if (result) {
                stack.push(i);
            }
        }
        int size = stack.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
