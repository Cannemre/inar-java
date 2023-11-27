package week_12.assignments.Question_12_21;

import java.io.File;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args) throws Exception {
        File file = new File(System.getProperty("user.dir") + "/src/week_12/assignments/Question_12_21/SortedStrings.txt");
        if (!file.exists()) {
            System.out.println(file.getName() + " does not exist");
            System.exit(0);
        }
        System.out.println("File \n" + file.getAbsolutePath());
        boolean isSorted = true;
        String str1 = "";
        String str2;
        try (Scanner input = new Scanner(file)) {
            if (input.hasNext())
                str1 = input.next();
            while (input.hasNext() && isSorted) {
                str2 = input.next();
                if (str1.compareTo(str2) > 0) {
                    System.out.println("The strings " + str1 + " and " + str2 + " are out of order");
                    isSorted = false;
                }
                str1 = str2;
            }
        }
        if (isSorted) {
            System.out.println("The file is increasing order");
        }
    }
}
