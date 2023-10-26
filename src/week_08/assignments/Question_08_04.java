package week_08.assignments;

import week_07.assignments.Question_07_17;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        int employee = input.nextInt();
        int[] totalHours = new int[employee];
        String[] employeeName = new String[employee];
        int[][] workingHours = new int[employee][7];
        System.out.print("Enter the working hours of employees: ");
        for (int i = 0; i < workingHours.length; i++) {
            for (int j = 0; j < workingHours[i].length; j++) {
                workingHours[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < employee; i++) {
            totalHours[i] = totalWorkHour(workingHours, i);
            employeeName[i] = "Employee " + (i + 1);
        }
        Question_07_17.sort(totalHours, employeeName);
        System.out.println("Employees and their total hours in decreasing order of the total hours: ");
        for (int i = 0; i < employee; i++) {
            System.out.println(employeeName[i] + "'s total work hour is " + totalHours[i]);
        }
    }

    public static int totalWorkHour(int[][] workingHours, int n) {
        int sum = 0;
        for (int i = 0; i < workingHours[n].length; i++) {
            sum += workingHours[n][i];
        }
        return sum;
    }
}
