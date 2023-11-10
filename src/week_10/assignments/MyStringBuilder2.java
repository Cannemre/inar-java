package week_10.assignments;

public class MyStringBuilder2 {
    private String s = "";

    public MyStringBuilder2() {

    }

    public MyStringBuilder2(char[] chars) {
        this.s = String.valueOf(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String first = this.s.substring(0, offset);
        String last = this.s.substring(offset);

        return new MyStringBuilder2(first + s.toString() + last);
    }

    public MyStringBuilder2 reverse() {
        StringBuilder result = new StringBuilder();
        for (int i = this.s.length() - 1; i >= 0; i--) {
            result.append(this.s.charAt(i));
        }
        return new MyStringBuilder2(result.toString());
    }

    public MyStringBuilder2 substring(int begin) {
        this.s = this.s.substring(begin);
        return this;
    }

    public MyStringBuilder2 toUpperCase() {
        this.s = this.s.toUpperCase();
        return this;
    }

    public String toString() {
        return this.s;
    }

    public int length() {
        return this.s.length();
    }

    public char charAt(int index) {
        return this.s.charAt(index);
    }
}
