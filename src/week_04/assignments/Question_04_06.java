package week_04.assignments;

public class Question_04_06 {
    public static void main(String[] args) {
        double randomAngels1 = (int) (Math.random() * 359) + 1;
        double randomAngels2 = (int) (Math.random() * 359) + 1;
        double randomAngels3 = (int) (Math.random() * 359) + 1;
        double radius = 40;
        double point1x = radius * Math.cos(Math.toRadians(randomAngels1));
        double point1y = radius * Math.sin(Math.toRadians(randomAngels1));
        double point2x = radius * Math.cos(Math.toRadians(randomAngels2));
        double point2y = radius * Math.sin(Math.toRadians(randomAngels2));
        double point3x = radius * Math.cos(Math.toRadians(randomAngels3));
        double point3y = radius * Math.sin(Math.toRadians(randomAngels3));
        double distance12 = Math.sqrt(Math.pow(point1x - point2x, 2) + Math.pow(point1y - point2y, 2));
        double distance13 = Math.sqrt(Math.pow(point1x - point3x, 2) + Math.pow(point1y - point3y, 2));
        double distance23 = Math.sqrt(Math.pow(point3x - point2x, 2) + Math.pow(point3y - point2y, 2));
        double angelA = (Math.pow(distance13, 2) + Math.pow(distance23, 2) - Math.pow(distance12, 2)) / (2 * distance13 * distance23);
        double angel1 = Math.toDegrees(Math.abs(angelA));
        double angelB = (Math.pow(distance12, 2) + Math.pow(distance23, 2) - Math.pow(distance13, 2)) / (2 * distance12 * distance23);
        double angel2 = Math.toDegrees(Math.abs(angelB));
        double angel3 = 180 - (angel1 + angel2);
        System.out.printf("The three angles are : %f, %f, %f", angel1, angel2, angel3);


    }
}
