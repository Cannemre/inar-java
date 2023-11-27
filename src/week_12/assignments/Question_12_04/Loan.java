package week_12.assignments.Question_12_04;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date();
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
        if (annualInterestRate > 0) {
            this.annualInterestRate = annualInterestRate;
        } else {
            throw new IllegalArgumentException("Wrong input! Please greater than 0 (zero)");
        }
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        } else {
            throw new IllegalArgumentException("Wrong input! Please greater than 0 (zero)");
        }
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
        if (loanAmount > 0) {
            this.loanAmount = loanAmount;
        } else {
            throw new IllegalArgumentException("Wrong input! Please greater than 0 (zero)");
        }
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
