import java.util.Scanner;

public class Level1Q9 {
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = convertToUpper(text);
        String builtIn = text.toUpperCase();
        boolean isEqual = compareStrings(manual, builtIn);

        System.out.println("Custom Uppercase: " + manual);
        System.out.println("Built-in Uppercase: " + builtIn);
        System.out.println("Are they equal? " + isEqual);
        sc.close();
    }
}
