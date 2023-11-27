package week_12.assignments.Question_12_31;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) throws IOException {
        System.out.println("Year    Rank 1      Rank 2      Rank 3      Rank 4      Rank 5      Rank 1      Rank 2      Rank 3      Rank 4      Rank 5");
        for (int i = 2010; i > 2000; i--) {
            URL url = new URL("https://liveexample.pearsoncmg.com/data/babynameranking" + i + ".txt");
            Scanner input = new Scanner(url.openStream());
            System.out.print(i + "    ");
            String[] maleName = new String[5];
            for (int j = 0; j < 5; j++) {
                String str = input.nextLine();
                String[] strArray = str.split("\\s+");
                System.out.printf("%-12s", strArray[3]);
                maleName[j] = strArray[1];
            }
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-12s", maleName[j]);
            }
            System.out.println();
        }
    }
}
