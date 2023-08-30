package week_04.assignments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String status = input.nextLine();
        char character1 = status.charAt(0);
        char character2 = status.charAt(1);
        if (character1 != 'M' && character1 != 'C' && character1 != 'I') {
            System.out.println("Invalid input");
        }
        if (character2 != '1' && character2 != '2' && character2 != '3' && character2 != '4') {
            System.out.println("Invalid input");
        }
        if (character1 == 'M') {
            if (character2 == '1') {
                System.out.println("Mathematics Freshman");
            } else if (character2 == '2') {
                System.out.println("Mathematics Sophomore");
            } else if (character2 == '3') {
                System.out.println("Mathematics Junior");
            } else if (character2 == '4') {
                System.out.println("Mathematics Senior");
            }
        }
        if (character1 == 'C') {
            if (character2 == '1') {
                System.out.println("Computer Science Freshman");
            } else if (character2 == '2') {
                System.out.println("Computer Science Sophomore");
            } else if (character2 == '3') {
                System.out.println("Computer Science Junior");
            } else if (character2 == '4') {
                System.out.println("Computer Science Senior");
            }
        }
        if (character1 == 'I') {
            if (character2 == '1') {
                System.out.println("Information Technology Freshman");
            } else if (character2 == '2') {
                System.out.println("Information Technology Sophomore");
            } else if (character2 == '3') {
                System.out.println("Information Technology Junior");
            } else if (character2 == '4') {
                System.out.println("Information Technology Senior");
            }
        }
    }
}
