package week_11.assignments;

import java.util.Date;

public class Transactions {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transactions(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void withdraw() {
        this.balance -= amount;
    }

    public void deposit() {
        this.balance += amount;
    }

    @Override
    public String toString() {
        String type;
        if (this.type == 'W') {
            type = "Withdraw";
        } else {
            type = "Deposit";
        }
        return "\nDate: " + date + "\nTransaction type: " + type + "\nAmount: " + amount + "\nBalance: " + balance + "\nDescription: " + description + "\n";
    }
}
