package week_09.assignments;

import java.util.Date;

public class Account {

    private int id = 0;

    private double balance = 0;

    private double annualInterestRate = 0;

    private final Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void displayAccountStatement(Account member) {
        System.out.println("\t\t\tAccount Statement :");
        System.out.println("------------------------------------------------");
        System.out.println("Account ID       : " + member.getId());
        System.out.println("Date Created     : " + member.getDateCreated());
        System.out.printf("Balance          : $%.2f\n", member.getBalance());
        System.out.printf("Monthly Interest : $%.2f", getMonthlyInterest());
    }
}
