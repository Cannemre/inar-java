package week_06.assignments;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet     Meters    |    Meters    Feet");
        System.out.println("--------------------------------------");
        double j = 20;
        for (double i = 1; i <= 10 ; i++) {
            System.out.printf("%.1f       %.3f    |    %.1f      %.3f", i, footToMeter(i), j, meterToFoot(j));
            System.out.println();
            j += 5;
        }
    }
    public static double footToMeter (double foot) {
        double meter;
        meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot (double meter) {
        double foot;
        foot = 3.279 * meter;
        return foot;
    }
}
