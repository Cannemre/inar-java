package week_02.assignments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfYears;
        int population;
        System.out.println(" Enter the number of years: ");
        numberOfYears = input.nextInt();
        population = numberOfYears * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) + 312032486;
        System.out.println(" The population in " + numberOfYears + " years is " + population);


    }
}
