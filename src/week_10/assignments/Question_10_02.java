package week_10.assignments;

public class Question_10_02 {
    public static void main(String[] args) {
        BMI sample = new BMI("Martin",50, 50,5,7);
        System.out.println(sample.getStatus());
        BMI sample2 = new BMI("Adam Smith",50, 70,5,7);
        System.out.println(sample2.getStatus());
    }
}
