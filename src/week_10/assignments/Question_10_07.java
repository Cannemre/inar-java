package week_10.assignments;

import week_09.assignments.Account;

import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }
        while (true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            int choice = 0;
            while (choice != 4) {
                System.out.println("--Main Menu--\n1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit");
                System.out.print("Enter a choice: ");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                } else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    double amount = input.nextDouble();
                    accounts[id].withdraw(amount);
                } else if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    double amount = input.nextDouble();
                    accounts[id].deposit(amount);
                }
            }
        }
    }
}
