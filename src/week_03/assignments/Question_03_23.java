package week_03.assignments;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a point with two coordinates: ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();
        if (-5 <= pointX && pointX <= 5) {
            if (-2.5 <= pointY && pointY <= 2.5) {
                System.out.println(" Point (" + pointX + " , " + pointY + ") is in the rectangle ");
            } else {
                System.out.println(" Point (" + pointX + " , " + pointY + ") is not in the rectangle ");
            }
        } else {
            System.out.println(" Point (" + pointX + " , " + pointY + ") is not in the rectangle ");
        }
    }
}
