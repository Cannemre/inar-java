package week_10.assignments;

public class Question_10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println(Time.toString(time1) + "\n" + Time.toString(time2));
    }
}
