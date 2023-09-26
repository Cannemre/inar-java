package week_06.assignments;

public class Question_06_32 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 10000; i++) {
            int number1 = rollDice();
            int number2 = rollDice();
            int sum = number1 + number2;
            System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
            if (sum == 7 || sum == 11) {
                System.out.println("You win");
                counter++;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose");
            } else {
                int newSum = 1;
                System.out.println("Point is " + sum);
                do {
                    sum = newSum;
                    number1 = rollDice();
                    number2 = rollDice();
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
                    counter++;
                }
            }
        }
        System.out.println("Number of winning games: " + counter);
    }

    public static int rollDice() {
        return (int) ((Math.random() * 6) + 1);
    }
}

