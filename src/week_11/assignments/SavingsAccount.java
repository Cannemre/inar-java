package week_11.assignments;

import week_09.assignments.Account;

public class SavingsAccount extends Account {
    SavingsAccount() {

    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public String toString() {
        return "ID: " + getId() + "\nBalance: " + getBalance();
    }
}
