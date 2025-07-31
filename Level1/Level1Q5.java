import java.util.Scanner;

public class Level1Q5 {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Error
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
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
