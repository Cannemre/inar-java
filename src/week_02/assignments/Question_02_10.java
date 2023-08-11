package week_02.assignments;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        double weight;
        double initialTemperature;
        double finalTemperature;
        double energy;
        System.out.println(" Enter the amount of water in kilograms ");
        weight = input.nextDouble();
        System.out.println(" Enter the initial temperature ");
        initialTemperature = input.nextDouble();
        System.out.println(" Enter the final temperature ");
        finalTemperature = input.nextDouble();
        energy = weight * (finalTemperature - initialTemperature) * 4184;
        System.out.println(" The energy needed is " + energy);
    }
}
