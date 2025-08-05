import java.util.Scanner;
import java.util.Random;

public class Problem1_NumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int low = 1, high = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!guessed && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is it " + guess + "? (Enter: high / low / correct)");
            String feedback = getUserFeedback();

            switch (feedback.toLowerCase()) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number.");
                    guessed = true;
                    break;
                default:
                    System.out.println("Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!guessed) {
            System.out.println("It seems something went wrong. Are you sure you played fair?");
        }
    }

    static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    static String getUserFeedback() {
        return scanner.next();
    }
}
