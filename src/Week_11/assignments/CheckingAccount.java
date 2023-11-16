package Week_11.assignments;

import week_09.assignments.Account;

public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount() {
        this.limit = 0;
    }

    public CheckingAccount(double limit) {
        this.limit = limit;
    }

    public CheckingAccount(int id, double balance, double limit) {
        super(id, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String toString() {
        return "ID: " + getId() + "\nBalance is $" + getBalance() + "\nLimit is $" + limit;
    }
}
