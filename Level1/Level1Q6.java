import java.util.Scanner;

public class Level1Q6 {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // Error
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // generateException(input); // Uncomment to test crash
        handleException(input);
        sc.close();
    }
}
