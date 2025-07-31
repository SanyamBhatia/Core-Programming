public class Level3Q9 {

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

        Level3Q8.shuffle(deck); // reuse shuffle logic

        System.out.println("Cards distributed to players:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < 13; j++) {
                System.out.print(deck[i * 13 + j] + " ");
            }
            System.out.println("\n");
        }
    }
}
