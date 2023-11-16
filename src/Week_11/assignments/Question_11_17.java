package Week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int tempM = m;
        ArrayList<Integer> factors = new ArrayList<>();
        while (m != 1) {
            for (int i = 2; i <= m; i++) {
                if (m % i == 0) {
                    factors.add(i);
                    m /= i;
                    break;
                }
            }
        }
        ArrayList<Integer> nNumbers = new ArrayList<>();
        for (int i = 0; i < factors.size(); i++) {
            int counter = 0;
            for (Integer factor : factors) {
                if (factor.equals(factors.get(i)) && !nNumbers.contains(i)) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                nNumbers.add(factors.get(i));
            }
        }
        int n = 1;
        for (Integer nNumber : nNumbers) {
            n *= nNumber;
        }
        System.out.println("The smallest number for m * n to be a perfect square is " + n + "\nm * n is " + tempM * n);
    }
}
