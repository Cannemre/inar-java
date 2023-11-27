package week_12.assignments.Question_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_11 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java Question_12_11 John filename");
            System.exit(1);
        }
        File sourceFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[1] + " does not exist");
            System.exit(2);
        }
        String s = "";
        try {
            try (Scanner input = new Scanner(sourceFile)) {
                while (input.hasNext()) {
                    String line = input.nextLine();
                    s += line.replace(args[0], "") + "\n";
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            try (PrintWriter printWriter = new PrintWriter(sourceFile)) {
                printWriter.print(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
