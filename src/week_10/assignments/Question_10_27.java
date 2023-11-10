package week_10.assignments;

public class Question_10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 str1 = new MyStringBuilder1("La Casa De Papel--");
        System.out.println(str1.toString());
        MyStringBuilder1 str2 = new MyStringBuilder1("@El Profesor");
        System.out.println(str1.append(str2).toString());
        System.out.println(str1.append(4161));
        System.out.println(str1.length());
        System.out.println(str1.charAt(11));
        System.out.println(str1.toLowerCase());
        MyStringBuilder1 str3 = str1.toLowerCase();
        System.out.println(str3.substring(19,30).toString());
    }
}
