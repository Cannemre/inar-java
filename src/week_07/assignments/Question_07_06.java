package week_07.assignments;

public class Question_07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int counter = 0;
        int n = 2;
        while (counter != 50) {
            boolean result = true;
            for (int i = counter - 1; i >= 0; i--) {
                if (primeNumbers[i] <= Math.sqrt(n) && n % primeNumbers[i] == 0) {
                    result = false;
                    break;
                }
            }
            if (result) {
                primeNumbers[counter] = n;
                counter++;
            }
            n++;
        }
        for (int i = 1; i <= primeNumbers.length; i++) {
            System.out.printf("%3d ", primeNumbers[i - 1]);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
