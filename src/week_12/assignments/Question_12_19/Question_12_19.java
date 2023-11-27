package week_12.assignments.Question_12_19;

import java.net.URL;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args) {
        String website = "https://en.wikipedia.org/wiki/The_Cranberries";
        try {
            URL url = new URL(website);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The total word number is " + count + " in " + "\n" + website);
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
