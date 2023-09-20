package week_06.assignments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit    |    Fahrenheit     Celsius");
        System.out.println("------------------------------------------------------");
        double j = 120;
        for (double i = 40; i >= 1 ; i--) {
            System.out.printf("%.1f        %1.1f         |    %1.1f           %2.2f",i,celsiusToFahrenheit(i),j,fahrenheitToCelsius(j));
            System.out.println();
            j -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius;
        celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
