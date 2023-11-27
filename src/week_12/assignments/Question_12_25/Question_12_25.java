package week_12.assignments.Question_12_25;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String name = input.nextLine();
        File file = new File(System.getProperty("user.dir") + "/src/week_12/assignments/Question_12_25/" + name);
        if (file.mkdir()) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Directory already exist");
        }
    }
}
