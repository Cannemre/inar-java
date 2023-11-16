package Week_11.assignments;

public class Question_11_02 {
    public static void main(String[] args) {
        Person person = new Person("Gurol", "Istanbul", "9999999999", "gurol@inar.com");
        Student student = new Student("Nafiz","Ankara","3333333333","nafiz@gmail.com",0);
        Employee employee = new Employee("Recai","Istanbul","6666666666","recai@gmail.com",910,60000);
        Faculty faculty = new Faculty("Serhat","Texas, Dallas","4133333333","serhat@inar.com",101,50000,"10am to 6pm","Manager");
        Staff staff = new Staff("Elon", "California","2030222220","elon@musk.com",12,6005000,"CEO");
        System.out.println(person.toString() + "\n");
        System.out.println(student.toString() + "\n");
        System.out.println(employee.toString() + "\n");
        System.out.println(faculty.toString() + "\n");
        System.out.println(staff.toString());
    }
}
