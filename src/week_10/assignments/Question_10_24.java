package week_10.assignments;

public class Question_10_24 {
    public static void main(String[] args) {
        MyCharacter a = new MyCharacter('a');
        MyCharacter b = new MyCharacter('z');
        System.out.println(a);
        System.out.println(b);
        System.out.println(MyCharacter.compare('z', 'a'));
        System.out.println(MyCharacter.compare('a', 'z'));
        System.out.println(a.compareTo(b));
        System.out.println(a.equals(b));
        System.out.println(MyCharacter.isDigit('a'));
        System.out.println(MyCharacter.isLetter('4'));
        System.out.println(MyCharacter.isDigit('8'));
        System.out.println(MyCharacter.isLetterOrDigit('0'));
        System.out.println(MyCharacter.isLetterOrDigit('%'));
        System.out.println(MyCharacter.toLowerCase('E'));
        System.out.println(MyCharacter.toUpperCase('e'));

    }
}
