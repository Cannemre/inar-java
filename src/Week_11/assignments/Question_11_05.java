package Week_11.assignments;

public class Question_11_05 {
    public static void main(String[] args) {
        Course newCourse = new Course("Chess");
        newCourse.addStudent("Nisanur Altuntas");
        newCourse.addStudent("Gurkan Serteser");
        newCourse.addStudent("Sinan Cetin");
        newCourse.addStudent("Mehmet Toprak");
        newCourse.addStudent("Sefa Atakul");
        newCourse.addStudent("Musa Denis");
        newCourse.addStudent("Berkan Eris");
        System.out.println("After adding student to the course..\n" + newCourse.getStudents() + "\nNumber of students: " + newCourse.getNumberOfStudents());
        newCourse.dropStudent("Sinan Cetin");
        newCourse.dropStudent("Mehmet Toprak");
        newCourse.dropStudent("Berkan Eris");
        System.out.println("After dropping student from the course..\n" + newCourse.getStudents() + "\nNumber of students: " + newCourse.getNumberOfStudents());
    }
}
