package week_14.assignments.Question_14_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input2 = input.next();
            if (input2.equals("-1")) {
                break;
            } else {
                list.add(input2);
            }
        }
        System.out.println("Original list of words: " + list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    for (int k = 0; k < list.get(i).length(); k++) {
                        boolean control = false;
                        for (int l = 0; l < list.get(j).length(); l++) {
                            if ((list.get(i).charAt(k) == list.get(j).charAt(l))) {
                                control = true;
                                break;
                            }
                        }
                        if (!control) {
                            break;
                        }
                    }
                }
            }
        }
    }
}
