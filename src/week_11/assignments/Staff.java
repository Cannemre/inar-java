package week_11.assignments;

import week_10.assignments.MyDate;

public class Staff extends Employee {
    private String title;

    Staff() {
        this.title = "Unknown";
        super.setHiredDate(new MyDate());
    }

    public Staff(String title) {
        this.title = title;
        super.setHiredDate(new MyDate());
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, int office, double salary, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
        super.setHiredDate(new MyDate());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "   _Employee_\nName: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nHired Date: " + getHiredDate()
                + "\nTitle: " + title;
    }
}
