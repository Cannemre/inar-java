package week_05.assignments;

public class Question_05_20 {
    public static void main(String[] args) {
        int primeNumbersCount = 0;
        for (int i = 2; i <= 1000; i++) {
            boolean result = true;
            for (int k = (i - 1); k >= 2; k--) {
                if (i % k == 0) {
                    result = false;
                    }
                }
            if (result) {
                primeNumbersCount++;
                System.out.print(i + " ");
                if(primeNumbersCount % 8 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}

