package week_10.assignments;

public class BMI {
    String name;
    int age;
    double weight;
    double feet;
    double inches;
    public static final double POUND_PER_KILOGRAMS = 0.45359237;

    BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public double getBMI() {
        return weight * POUND_PER_KILOGRAMS / ((feet * 12 + inches) * 2.54) * ((feet * 12 + inches) * 2.54);
    }

    public String getStatus() {
        if (getBMI() < 18.5) {
            return "Name: " + name + "\nBMI : " + getBMI() + " Underweight";
        } else if (getBMI() < 25) {
            return "Name: " + name + "\nBMI : " + getBMI() + " Normal";
        } else if (getBMI() < 30) {
            return "Name: " + name + "\nBMI : " + getBMI() + " Overweight";
        } else {
            return "Name: " + name + "\nBMI : " + getBMI() + " Obese";
        }
    }
}
