package week_12.assignments.Question_12_29;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateTxtFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(System.getProperty("user.dir") + "/src/week_12/assignments/Question_12_29/Lincoln.txt");
        PrintWriter output = new PrintWriter(file);
        output.println("Write a program that prompts the user to enter a file name and displays the occurrences of each letter in the file. Letters are case-insensitive. Here is a sample run.");
        output.close();
    }
}
