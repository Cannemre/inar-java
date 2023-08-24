package week_03.assignments;

public class Question_03_16 {
    public static void main(String[] args) {
        int xNegative = (int) (Math.random() * -51);
        int xPositive = (int) (Math.random() * 51);
        int yNegative = (int) (Math.random() * -101);
        int yPositive = (int) (Math.random() * 101);
        int x = xNegative + xPositive;
        int y = yNegative + yPositive;
        System.out.println(" Random coordinate in rectangle centered at (0,0) with 100 and height 200: (" + x + "," + y + ")");



    }
}
