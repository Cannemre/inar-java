package Week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        double sum = 0;
        for (Double aDouble : list) {
            sum += aDouble;
        }
        System.out.println("Sum of list: " + sum);
    }
}
