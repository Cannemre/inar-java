package week_10.assignments;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        Arrays.fill(students,"");
    }

    public void addStudent(String student) {
        if (numberOfStudents > students.length - 1) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                students[i] = "";
                for (int j = i + 1; j <= numberOfStudents; j++) {
                    String temp = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = temp;
                }
            }
        }
    }

    public void clear() {
        students = new String[students.length];
    }
}
