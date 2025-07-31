import java.util.Scanner;

public class Level1Q2 {
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subCharAt = substringUsingCharAt(text, start, end);
        String subBuiltIn = text.substring(start, end);
        boolean result = compareStrings(subCharAt, subBuiltIn);

        System.out.println("Custom substring: " + subCharAt);
        System.out.println("Built-in substring: " + subBuiltIn);
        System.out.println("Are both equal? " + result);
        sc.close();
    }
}
