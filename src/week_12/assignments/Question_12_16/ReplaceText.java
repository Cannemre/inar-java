package week_12.assignments.Question_12_16;

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class ReplaceText {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java Question_12_16 file oldString newString");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }
        try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(file)
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[1], args[2]);
                output.println(s2);
            }
        }
    }
}
