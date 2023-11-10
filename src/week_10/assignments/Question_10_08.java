package week_10.assignments;

public class Question_10_08 {
    public static void main(String[] args) {
        System.out.println("                    2009 Taxes\nIncome   Status 0   Status 1   Status 2   Status 3");
        System.out.println("------------------------------------------------------------------");
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%d", i);
            for (int j = 0; j < 4; j++) {
                Tax tax = new Tax(j, i);
                System.out.printf("    %.2f", tax.getTax());
            }
            System.out.println();
        }
    }
}
