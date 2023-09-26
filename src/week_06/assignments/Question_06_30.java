package week_06.assignments;

public class Question_06_30 {
    public static void main(String[] args) {
        int number1 = rollDice();
        int number2 = rollDice();
        int sum = number1 + number2;
        System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
        if (sum == 7 || sum == 11) {
            winCondition(number1, number2);
        } else if (sum == 2 || sum == 3 || sum == 12) {
            loseCondition(number1, number2);
        } else {
            drawCondition(sum);
        }
    }


    public static int rollDice() {
        return (int) ((Math.random() * 6) + 1);
    }

    public static void winCondition(int n1, int n2) {
        int sum = n1 + n2;
        if (sum == 7 || sum == 11) {
            System.out.println("You win");
        }
    }

    public static void loseCondition(int n1, int n2) {
        int sum = n1 + n2;
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        }
    }

    public static void drawCondition(int sum) {
        int newSum = 1;
        System.out.println("Point is " + sum);
        do {
            sum = newSum;
            int number1 = rollDice();
            int number2 = rollDice();
            newSum = number1 + number2;
            System.out.println("You rolled " + number1 + " + " + number2 + " = " + newSum);
            if (newSum != sum && newSum != 7) {
                System.out.println("Point is " + newSum);
            }
        } while (newSum != sum && newSum != 7);
        if (newSum == 7) {
            System.out.println("You lose");
        } else {
            System.out.println("You win");
        }
    }
}

