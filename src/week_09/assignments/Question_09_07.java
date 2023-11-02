package week_09.assignments;

public class Question_09_07 {
    public static void main(String[] args) {
        Account member = new Account(1122, 20000);
        member.setAnnualInterestRate(4.5);
        member.withdraw(500);
        member.deposit(1000);
        member.displayAccountStatement(member);
    }
}
