package week_11.assignments;

import week_10.assignments.Circle2D;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> object = new ArrayList<>();
        Date date = new Date();
        String s = "InarAcademy";
        Circle2D circle = new Circle2D();
        object.add(date);
        object.add(s);
        object.add(circle);
        for (Object o : object) {
            System.out.println(o);
        }
    }
}
