package week_07.live_class;

import java.util.Scanner;

public class drawCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        System.out.print("Enter the number of cards you want to draw: ");
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("Choose a number between [0-51]: ");
            int selection = input.nextInt();
            String suit = suits[deck[selection] / 13];
            String rank = ranks[deck[selection] % 13];
            System.out.println("Card " + selection + ": Card number " + deck[selection] + ": " + rank + " of " + suit);
        }
    }
}
