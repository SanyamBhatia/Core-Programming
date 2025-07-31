import java.util.Random;

public class Level3Q8 {

    public static void main(String[] args) {
        String[] suits = { "♠", "♥", "♦", "♣" };
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "A"
        };

        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + suit;
            }
        }

        shuffle(deck);

        System.out.println("Shuffled deck:");
        for (int i = 0; i < 52; i++) {
            System.out.print(deck[i] + "\t");
            if ((i + 1) % 13 == 0) System.out.println();
        }
    }

    public static void shuffle(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }
}
