package week_07.assignments;

public class Question_07_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int i = deck.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * i);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        String tempSuit1 = " ";
        String tempSuit2 = " ";
        String tempSuit3 = " ";
        int counter = 0;
        int displayCounter = 0;
        while (displayCounter < 4) {
            int random = (int) (Math.random() * 52);
            counter++;
            String suit = suits[deck[random] / 13];
            String rank = ranks[deck[random] % 13];
            if (!tempSuit1.equals(suit) && !tempSuit2.equals(suit) && !tempSuit3.equals(suit)) {
                System.out.println(rank + " of " + suit);
                displayCounter++;
            }
            if (displayCounter == 1) {
                tempSuit1 = suit;
            } else if (displayCounter == 2 && !suit.equals(tempSuit1)) {
                tempSuit2 = suit;
            } else if (displayCounter == 3 && !suit.equals(tempSuit1) && !suit.equals(tempSuit2)) {
                tempSuit3 = suit;
            }
            shiftList(deck, random);
        }
        System.out.println("Number of picks: " + counter);
    }

    public static void shiftList(int[] deck, int random) {
        int temp;
        for (int i = random; i < deck.length - 1; i++) {
            temp = deck[i];
            deck[i] = deck[i + 1];
            deck[i + 1] = temp;
        }
    }
}
