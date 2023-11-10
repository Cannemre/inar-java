package week_10.assignments;

public class Question_10_28 {
    public static void main(String[] args) {
        MyStringBuilder2 str1 = new MyStringBuilder2("Besiktas");
        MyStringBuilder2 str2 = new MyStringBuilder2("1903");
        System.out.print("Insert str1 into str2 at index 2 --------> ");
        MyStringBuilder2 s3 = str2.insert(2, str1);
        System.out.println(s3);
        System.out.println("Reverse str1 --------------------------> " + str1.reverse().toString());
        System.out.println("Substring of s3 beginning index 10 --> " + s3.substring(10));
        System.out.println("S2 to upper case --------------------> " + str1.toUpperCase());
    }
}
