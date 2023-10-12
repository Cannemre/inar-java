package week_07.assignments;

public class Question_07_29 {
    public static void main(String[] args) {
        int[] deck = new int[52];
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
        boolean result = true;
        String[] rank = new String[4];
        while (result) {
            int total = 0;
            for (int i = 0; i < 4; i++) {
                int draw = (int) (Math.random() * 52);
                rank[i] = ranks[draw % 13];
                total += draw % 13 + 1;
            }
            if (total == 24) {
                result = false;
            }
        }
        System.out.println("The number of picks that yields the sum of 24: " + rank[0] + " " + rank[1] + " " + rank[2] + " " + rank[3]);
    }
}
