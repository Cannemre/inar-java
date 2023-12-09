package week_13.assignments.Question_13_13;

import java.util.Arrays;

public class Question_13_13 {
    public static void main(String[] args) {
        Course course1 = new Course("Inar Academy");
        course1.addStudent("Burak");
        course1.addStudent("Emre");
        course1.addStudent("Furkan");
        course1.addStudent("Jack");
        Course course2 = course1.clone();
        course2.addStudent("Jonny");
        course2.addStudent("Tonny");
        System.out.println("Course name: " + course1.getCourseName());
        System.out.println("\nNumber of students in course1: " + course1.getNumberOfStudents());
        System.out.println(Arrays.toString(course1.getStudents()) + "\n-------------------------------");
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        System.out.println(Arrays.toString(course2.getStudents()));
    }
}
