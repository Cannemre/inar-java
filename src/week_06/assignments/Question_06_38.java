package week_06.assignments;

public class Question_06_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (Math.random() * (ch2 + 1 - ch1) + ch1);
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}
