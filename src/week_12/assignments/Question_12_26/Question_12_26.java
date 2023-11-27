package week_12.assignments.Question_12_26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_26 {
    public static void main(String[] args) throws Exception {
        ArrayList<File> list = new ArrayList<>();
        addFiles(list, args);
        replaceWords(list);
    }
    public static void replaceWords(ArrayList<File> file) throws FileNotFoundException {
        for (int i = 0; i < file.size(); i++) {
            ArrayList<String> list = new ArrayList<>();
            try (
                    Scanner input = new Scanner(file.get(i))
            ) {
                while (input.hasNext()) {
                    String word = input.nextLine();
                    if (word.contains("Question")) {
                        list.add(pad(word));
                    }
                    else
                        list.add(word);
                }
            }
            try (
                    PrintWriter output = new PrintWriter(file.get(i))
            ) {
                for (int j = 0; j < list.size(); j++) {
                    output.println(list.get(j));
                }
            }
        }
    }
    public static String pad(String word) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList(word.split(" ")));

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).matches("Question\\d_\\d")) {
                StringBuilder newStr = new StringBuilder(str.get(i));
                newStr.insert(newStr.length() - 1, 0 + "");
                newStr.insert(8, '0');
                str.remove(i);
                str.add(i, newStr.toString());
            }
        }

        String s = "";
        for (int i = 0; i < str.size(); i++) {
            s += str.get(i) + " ";
        }
        return s;
    }
    public static void addFiles(ArrayList<File> list, String[] args) {
        for (int i = 0; i < args.length; i ++) {
            if (!args[i].equals("Question_12_26.java") &&
                    !args[i].equals("Question_12_26.class")) {
                list.add(new File(args[i]));
            }
        }
    }
}
