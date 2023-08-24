package week_03.assignments;

public class Question_03_04 {
    public static void main(String[] args) {
        int number = (int) ((Math.random() * 12) + 1);
        switch (number) {
            case 1:
                System.out.println(number + "\nJanuary");
                break;
            case 2:
                System.out.println(number + "\nFebruary");
                break;
            case 3:
                System.out.println(number + "\nMarch");
                break;
            case 4:
                System.out.println(number + "\nApril");
                break;
            case 5:
                System.out.println(number + "\nMay");
                break;
            case 6:
                System.out.println(number + "\nJune");
                break;
            case 7:
                System.out.println(number + "\nJuly");
                break;
            case 8:
                System.out.println(number + "\nAugust");
                break;
            case 9:
                System.out.println(number + "\nSeptember");
                break;
            case 10:
                System.out.println(number + "\nOctober");
                break;
            case 11:
                System.out.println(number + "\nNovember");
                break;
            case 12:
                System.out.println(number + "\nDecember");
                break;
        }
    }
}
