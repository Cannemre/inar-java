package week_04.assignments;

public class Question_04_16 {
    public static void main(String[] args) {
        int randomInteger = (int)(Math.random() * (91 - 65) + 65);
        char randomUppercaseLetter = (char)(randomInteger);
        System.out.println(randomUppercaseLetter);
    }
}
