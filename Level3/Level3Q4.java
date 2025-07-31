import java.util.Scanner;

public class Level3Q4 {

    public static char findFirstNonRepeatingChar(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            boolean repeating = false;

            for (int j = 0; j < input.length(); j++) {
                if (i != j && ch == input.charAt(j)) {
                    repeating = true;
                    break;
                }
            }

            if (!repeating) return ch;
        }
        return '\0'; // No unique character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
