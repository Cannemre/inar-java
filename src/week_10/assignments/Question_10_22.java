package week_10.assignments;

public class Question_10_22 {
    public static void main(String[] args) {
        char[] ch = {'I','N','A','R'};
        char[] ch1 = {'I','N','A','R'};
        MyString1 str = new MyString1(ch);
        MyString1 str2 = new MyString1(ch1);
        System.out.println(str);
        MyString1 newStr = str.toLowerCase();
        System.out.println(newStr);
        MyString1 newStr2 = newStr.substring(0,3);
        System.out.println(newStr2);
        System.out.println(newStr2.length());
        System.out.println(newStr2.equals(str2));
        System.out.println(str.equals(str2));
    }
}
