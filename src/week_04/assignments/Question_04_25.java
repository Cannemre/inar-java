package week_04.assignments;

public class Question_04_25 {
    public static void main(String[] args) {
        int plateChar1 = (int)(Math.random() * (91 - 65) + 65);
        int plateChar2 = (int)(Math.random() * (91 - 65) + 65);
        int plateChar3 = (int)(Math.random() * (91 - 65) + 65);
        int plateNumber = (int)(Math.random() * (10000 - 1000) + 1000);
        char firstChar = (char) plateChar1;
        char secondChar = (char) plateChar2;
        char thirdChar = (char) plateChar3;
        System.out.printf("Generated plate number: %s%s%s%d", firstChar, secondChar, thirdChar, plateNumber);
    }
}
