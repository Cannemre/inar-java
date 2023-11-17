package week_11.assignments;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id = 0;

    private double balance = 0;

    private double annualInterestRate = 0;

    private final Date dateCreated;

    public ArrayList<Transactions> transactions = new ArrayList<>();

    public Account() {
        this.dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.dateCreated = new Date();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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
        Transactions withdraw = new Transactions('W', amount, this.balance, "Withdraw from ATM");
        withdraw.withdraw();
        this.transactions.add(withdraw);
        this.balance -= amount;
    }

    public void deposit(double amount) {
        Transactions deposit = new Transactions('D', amount, this.balance, "Deposit to Bank");
        deposit.deposit();
        this.transactions.add(deposit);
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nBalance: " + balance + "\n" + transactions.toString();
    }
}
