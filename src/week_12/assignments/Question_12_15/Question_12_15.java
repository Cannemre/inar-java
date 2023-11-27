package week_12.assignments.Question_12_15;

import java.io.File;
import java.io.PrintWriter;

public class Question_12_15 {
    public static void main(String[] args) throws Exception{
        File file = new File("Question_12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < 100; i++) {
                output.print(((int)(Math.random() * 100) + 1));
                output.print(" ");
            }
        }
    }
}
