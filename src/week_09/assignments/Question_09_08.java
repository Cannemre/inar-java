package week_09.assignments;

public class Question_09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.color = "yellow";
        fan1.setSpeed(3);
        fan1.setRadius(10);
        System.out.println(Fan.toString(fan1));
        System.out.println("---------------------");
        System.out.println(Fan.toString(fan2));
    }
}
