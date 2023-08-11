package week_02.assignments;

import java.util.Scanner;

public class Question_02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius;
        double fahrenheit;
        System.out.println(" Enter a degree in Celcius: ");
        celcius = input.nextDouble();
        fahrenheit = (9.0 / 5) * celcius + 32;
        System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");

    }
}
