package week_10.assignments;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(41614161);
        System.out.println(integer.getValue());
        System.out.println(integer.isEven());
        System.out.println(integer.isOdd());
        System.out.println(integer.isPrime());
        System.out.println(integer.equals(10));
        System.out.println(integer.equals(new MyInteger(41614161)));
        System.out.println(MyInteger.isEven(41614161));
        System.out.println(MyInteger.isOdd(41614161));
        System.out.println(MyInteger.isPrime(41614161));
        System.out.println(MyInteger.parseInt("123"));
        System.out.println(MyInteger.parseInt(new char[]{'1', '2', '3'}));
    }
}
