package week_10.assignments;

import java.util.Arrays;

public class Question_10_09 {
    public static void main(String[] args) {
        Course course1 = new Course("Math");
        course1.addStudent("Emre Can");
        course1.addStudent("Emre Cam");
        course1.addStudent("Emre Cab");
        course1.addStudent("Emre Cav");
        course1.addStudent("Emre Cax");
        System.out.println(Arrays.toString(course1.getStudents()));
        course1.dropStudent("Emre Cam");
        System.out.println(Arrays.toString(course1.getStudents()));
        course1.clear();
        System.out.println(Arrays.toString(course1.getStudents()));

    }
}
