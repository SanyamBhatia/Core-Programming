import java.util.Scanner;

public class Level1Q7 {
    public static void generateException(String text) {
        int number = Integer.parseInt(text); // May throw exception
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text (number or not): ");
        String input = sc.nextLine();

        // generateException(input); // Uncomment to test crash
        handleException(input);
        sc.close();
    }
}
