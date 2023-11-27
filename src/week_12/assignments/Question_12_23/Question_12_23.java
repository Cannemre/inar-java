package week_12.assignments.Question_12_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Question_12_23 {
    public static void main(String[] args) throws FileNotFoundException {
        File salary = new File(System.getProperty("user.dir") + "/src/week_12/assignments/Question_12_23/Salary.txt");
        PrintWriter output;
        output = new PrintWriter(salary);
        for (int i = 1; i <= 1000; i++) {
            double r0 = (Math.random() * 30000 + 50000);
            double r1 = (Math.random() * 50000 + 60000);
            double r2 = (Math.random() * 55000 + 75000);
            String[] rank = {"assistant", "associate", "full"};
            int random = (int) (Math.random() * 3);
            if (random == 0) {
                output.printf("FirstName%d LastName%d %s %.2f\n", i, i, rank[random], r0);
            } else if (random == 1) {
                output.printf("FirstName%d LastName%d %s %.2f\n", i, i, rank[random], r1);
            } else {
                output.printf("FirstName%d LastName%d %s %.2f\n", i, i, rank[random], r2);
            }
        }
        output.close();
    }
}
