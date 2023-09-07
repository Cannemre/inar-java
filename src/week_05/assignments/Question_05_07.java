package week_05.assignments;

public class Question_05_07 {
    public static void main(String[] args) {
        double tuition = 10000;
        double result = 0;
        for (int i = 1; i < 15; i++) {
            tuition += (tuition * 0.05);
          if (i == 10) {
              System.out.println("Tuition in ten years: $" + Math.round(tuition));
          }
          if ( i > 10) {
              result+= tuition;
          }
        }
        System.out.println("Total cost for four years worth of tuition after the tenth year: $" + Math.round(result));
    }
}
