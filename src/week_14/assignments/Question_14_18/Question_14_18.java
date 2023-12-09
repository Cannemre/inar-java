package week_14.assignments.Question_14_18;

public class Question_14_18 {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.addContact("Steve Doe", "123-456-7890");
        manager.addContact("Jane Smith", "123-456-7845");
        System.out.println(manager.searchByName("Steve Doe"));
        System.out.println(manager.searchByPhoneNumber("123-456-7845"));
    }
}
