package week_11.assignments;

import week_10.assignments.MyDate;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {
        this.officeHours = "Unknown";
        this.rank = "Unknown";
        super.setHiredDate(new MyDate());
    }

    public Faculty(String officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
        super.setHiredDate(new MyDate());
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, int office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
        super.setHiredDate(new MyDate());
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return "   _Faculty_\nName: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nHired Date: " + getHiredDate()
                + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
    }
}
