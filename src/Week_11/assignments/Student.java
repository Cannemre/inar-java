package Week_11.assignments;

public class Student extends Person {
    public static final String FRESHMAN = "FRESHMAN";
    public static final String SOPHOMORE = "SOPHOMORE";
    public static final String JUNIOR = "JUNIOR";
    public static final String SENIOR = "SENIOR";
    private int classStatus;
    public Student() {
        this.classStatus = 0;
    }

    public Student(int classStatus) {
        this.classStatus = classStatus;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, int classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public String getClassStatus(int classStatus) {
        switch (classStatus) {
            case 0 -> {
                return FRESHMAN;
            }
            case 1 -> {
                return SOPHOMORE;
            }
            case 2 -> {
                return JUNIOR;
            }
            case 3 -> {
                return SENIOR;
            }
        }
        return "UNKNOWN";
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    public String toString() {
        return "   _Student_\nName: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress() + "\nClass Status: " + getClassStatus(classStatus);

    }
}
