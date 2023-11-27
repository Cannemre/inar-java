package week_12.assignments.Question_12_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Question_12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();
        File salaryList = new File(System.getProperty("user.dir") + "/src/week_12/assignments/Question_12_23/Salary.txt");
        Scanner input = new Scanner(salaryList);
        while (input.hasNext()) {
            input.next();
            input.next();
            String rank = input.next();
            double salary = input.nextDouble();
            processData(assistant, associate, full, rank, salary);
        }
        double totalAssistant = getTotal(assistant);
        double totalAssociate = getTotal(associate);
        double totalFull = getTotal(full);
        double totalFaculty = (totalAssistant + totalAssociate + totalFull);
        System.out.printf("Total salary for assistant professors: %.2f\n", totalAssistant);
        System.out.printf("Total salary for associate professors: %.2f\n", totalAssociate);
        System.out.printf("Total salary for full professors:      %.2f\n", totalFull);
        System.out.printf("Total salary for all faculty:          %.2f\n", totalFaculty);
        System.out.println("---------------------");
        System.out.printf("Average salary for assistant professors: %.2f\n", (totalAssistant / assistant.size()));
        System.out.printf("Average salary for associate professors: %.2f\n", (totalAssociate / associate.size()));
        System.out.printf("Average salary for full professors:      %.2f\n", (totalFull / full.size()));
        System.out.printf("Average salary for all faculty:          %.2f\n", (totalFaculty / (assistant.size() + associate.size() + full.size())));
    }

    public static double getTotal(ArrayList<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static void processData(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c, String rank, double salary) {
        switch (rank) {
            case "assistant" -> a.add(salary);
            case "associate" -> b.add(salary);
            case "full" -> c.add(salary);
        }
    }
}
