package Week_11.assignments;

import week_10.assignments.MyDate;

public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate hiredDate;

    public Employee() {
        this.office = 0;
        this.salary = 0;
        this.hiredDate = new MyDate();
    }

    public Employee(int office, double salary) {
        this.office = office;
        this.salary = salary;
        this.hiredDate = new MyDate();
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.hiredDate = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiredDate() {
        return hiredDate.toString();
    }

    public void setHiredDate(MyDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String toString() {
        return "   _Employee_\nName: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress() + "\nOffice: " + office + "\nSalary: " + salary + "\nHired Date: " + hiredDate.toString();
    }
}
