package week_12.assignments.Question_12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Some_Text {
    public static void main(String[] args) throws FileNotFoundException {
        File some_Text = new File(System.getProperty("user.dir") + "/some_text.txt");
        PrintWriter output = new PrintWriter(some_Text);
        output.println("Hello world Hello turkey Hello ankara");
        output.close();
    }
}
