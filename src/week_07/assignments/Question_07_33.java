package week_07.assignments;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println(year + " is a year of " + zodiac[year % 12] + " in zodiac");
    }
}
