package week_10.assignments;

public class MyCharacter {
    private char ch;

    public MyCharacter() {

    }

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public MyCharacter(String s, int index) {
        this.ch = s.charAt(index);
    }

    public char getCh() {
        return ch;
    }

    public static boolean isDigit(char ch) {
        return '9' >= ch && ch >= '0';
    }

    public static boolean isLetter(char ch) {
        return 'Z' >= ch && ch >= 'A' || 'z' >= ch && ch >= 'a';
    }

    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }

    public static boolean isLowerCase(char ch) {
        return 123 > ch && ch >= 97;
    }

    public static boolean isUpperCase(char ch) {
        return 91 > ch && ch >= 65;
    }

    public static char toLowerCase(char ch) {
        return (char) (ch - 32);
    }

    public static char toUpperCase(char ch) {
        return (char) (ch + 32);
    }

    public static MyCharacter valueOf(char ch) {
        return new MyCharacter(ch);
    }

    public int compareTo(MyCharacter ch) {
        return getCh() - ch.getCh();
    }

    public static int compare(char x, char y) {
        return x - y;
    }

    public boolean equals(MyCharacter ch) {
        return compareTo(ch) == 0;
    }

    public String toString() {
        return String.valueOf(ch);
    }
}
