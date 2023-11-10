package week_10.assignments;

public class MyStringBuilder1 {
    public String str;
    public MyStringBuilder1(String str) {
        this.str = str;
    }
    public MyStringBuilder1 append(MyStringBuilder1 s1) {
        this.str = this.str + s1.toString();
        return this;
    }
    public MyStringBuilder1 append(int i) {
        this.str = this.str + i;
        return this;
    }
    public int length() {
        return this.str.length();
    }
    public char charAt(int index) {
        return this.str.charAt(index);
    }
    public MyStringBuilder1 toLowerCase() {
        this.str = str.toLowerCase();
        return this;
    }
    public MyStringBuilder1 substring(int begin, int end) {
        this.str = this.str.substring(begin, end);
        return this;
    }
    public String toString() {
        return this.str;
    }

}
