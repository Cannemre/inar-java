package week_12.assignments.Question_12_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: Java Exercise_12_16 dir oldString newString");
            System.exit(1);
        }
        File dir = new File(args[0]);
        if (!dir.isDirectory()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(2);
        }
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File e = files[i];
            replaceText(e, args);
        }
    }

    public static void replaceText(File file, String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                list.add(s1.replaceAll(args[1], args[2]));
            }
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }
}
