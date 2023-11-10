package week_10.assignments;

public class MyString2 {
    public char[] chars;

    public MyString2(char[] chars) {
        this.chars = chars;
    }
    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public char charAt(int n) {
        return chars[n];
    }

    public int length() {
        return chars.length;
    }

    public MyString2 substring(int first) {
        char[] array = new char[chars.length - first];
        for (int i = first; i < array.length; i++) {
            array[i] = charAt(i);
        }
        return new MyString2(array);
    }

    public MyString2 toUpperCase() {
        char[] ch = new char[chars.length];
        for (int i = 0; i < ch.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                ch[i] = (char) (charAt(i) + ('A' - 'a'));
            }
        }
        return new MyString2(ch);
    }
    public char[] toChars() {
        return this.chars;
    }
    public String toString() {
        return new String(chars);
    }
}
