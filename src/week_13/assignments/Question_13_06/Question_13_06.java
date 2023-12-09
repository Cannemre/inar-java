package week_13.assignments.Question_13_06;

public class Question_13_06 {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle("blue", 16.5, true);
        ComparableCircle circle2 = new ComparableCircle("purple", 20.3, true);
        System.out.println("ComparableCircle1: " + circle1 + "\n\nComparableCircle2: " + circle2);
        if (circle1.compareTo(circle2) > 0) {
            System.out.println("\nComparableCircle1 is the larger of the two Circles");
        } else {
            System.out.println("\nComparableCircle2 is the larger of the two Circles");
        }

    }
}
