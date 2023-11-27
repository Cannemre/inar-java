package week_12.assignments.Question_12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SortedStr {
    public static void main(String[] args) {
        File sort = new File(System.getProperty("user.dir") + "/src/week_12/assignments/Question_12_21/SortedStrings.txt");
        PrintWriter output;
        try {
            output = new PrintWriter(sort);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        output.println("Emre");
        output.println("Can");
        output.println("Adana");
        output.println("Turkey");
        output.close();
    }
}
