package week_10.assignments;

public class Question_10_23 {
    public static void main(String[] args) {
        MyString2 str1 = new MyString2("elon musk");
        MyString2 str2 = new MyString2("Denmark");
        MyString2 str3 = new MyString2("emreGoZero");
        System.out.println(str1.toUpperCase());
        char[] ch = str2.toChars();
        System.out.println(ch[0]);
        System.out.println(str3.substring(4));
    }
}
