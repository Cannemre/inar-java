package week_06.assignments;

public class Question_06_15 {
    public static void main(String[] args) {
        System.out.println("Taxable       Single       Married Joint       Married       Head of");
        System.out.println("Income                     or Qualifying       Separate      a House");
        System.out.println("                           Widow (er)");
        System.out.println("---------------------------------------------------------------------");
        double income = 50000;
        while (income <= 60000) {
            System.out.print((int) income + "         " + computeTax(1, income));
            System.out.print("       " + computeTax(2, income));
            System.out.print("             " + computeTax(3, income));
            System.out.print("         " + computeTax(4, income));
            System.out.println();
            income += 50;
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        double status1;
        double status2;
        double status4;
        status1 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
        status2 = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
        status4 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
        if (status == 1) {
            return Math.round(status1);
        } else if (status == 2) {
            return Math.round(status2);
        } else if (status == 3) {
            return Math.round(status1);
        } else {
            return Math.round(status4);
        }
    }
}
