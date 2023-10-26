package week_08.assignments;

import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of bank: ");
        int numberOfBank = input.nextInt();
        double[][] borrowers = new double[numberOfBank][numberOfBank];
        double[] currentBalance = new double[numberOfBank];
        double[] totalDebtGiven = new double[numberOfBank];
        System.out.print("Enter minimum total assets for keeping a bank safe: ");
        double safeBankLimit = input.nextDouble();
        for (int i = 0; i < numberOfBank; i++) {
            System.out.printf("Enter bank %d 's total assets. " +
                    "Enter the number of banks that borrowed money from bank %d. " +
                    "Enter borrowers ID and amount borrowed: ", i, i);
            currentBalance[i] = input.nextDouble();
            int numberOfLoansGiven = input.nextInt();
            for (int j = 0; j < numberOfLoansGiven; j++) {
                int borrowingBankID = input.nextInt();
                double amountOfDebtGiven = input.nextDouble();
                borrowers[i][borrowingBankID] = amountOfDebtGiven;
            }
        }
        for (int i = 0; i < borrowers.length; i++) {
            for (int j = 0; j < borrowers[i].length; j++) {
                totalDebtGiven[i] += borrowers[i][j];
            }
        }
        for (int i = 0; i < numberOfBank; i++) {
            double totalAssets = currentBalance[i] + totalDebtGiven[i];
            if (totalAssets < safeBankLimit) {
                for (int j = 0; j < numberOfBank; j++) {
                    totalDebtGiven[j] -= borrowers[j][i];
                }
            }
        }
        System.out.println("Unsafe banks are:");
        for (int i = 0; i < numberOfBank; i++) {
            double totalAssets = currentBalance[i] + totalDebtGiven[i];
            if (totalAssets < safeBankLimit) {
                System.out.print(i + " ");
            }
        }
    }
}