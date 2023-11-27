package week_12.assignments.Question_12_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HangmanWords {
    public static void main(String[] args) {
        File wordList = new File(System.getProperty("user.dir") + "/src/week_12/assignments/Question_12_17/hangman.txt");
        PrintWriter output;
        try {
            output = new PrintWriter(wordList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        output.println("InarAcademy");
        output.println("InarJava");
        output.println("HelloWorld");
        output.println("HelloJava");
        output.close();
    }
}
