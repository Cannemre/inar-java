package week_10.assignments;

public class MyString1 {
    public char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int n) {
        return chars[n];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int first, int last) {
        char[] array = new char[last - first];
        for (int i = first; i < last; i++) {
            array[i] = charAt(i);
        }
        return new MyString1(array);
    }

    public MyString1 toLowerCase() {
        char[] ch = new char[length()];
        for (int i = 0; i < length(); i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                ch[i] = (char) (charAt(i) + ('a' - 'A'));
            }
        }
        return new MyString1(ch);
    }

    public boolean equals(MyString1 str) {
        if (length() != str.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return new String(chars);
    }
}
