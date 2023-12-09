package week_14.assignments.Question_14_03;

import java.util.ArrayList;

public class Question_14_03 {
    public static void main(String[] args) {
        ArrayList<String> points = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            double x = Math.random() * 100;
            double y = Math.random() * 100;
            Points point = new Points(x,y);
            points.add("(" + point.getX() + "," + point.getY() + ")");
        }
        System.out.println(points);
    }
}
