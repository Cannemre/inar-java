package Week_11.assignments;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    Person() {
        this.name = "Unknown";
        this.address = "Unknown";
        this.phoneNumber = "Unknown";
        this.emailAddress = "Unknown";
    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return "   _Person_\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAddress;
    }
}
