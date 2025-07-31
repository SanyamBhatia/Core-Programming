import java.util.Scanner;

public class Level2Q7 {

    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String custom = substringUsingCharAt(input, indexes[0], indexes[1]);
        String builtin = input.trim();

        System.out.println("Custom Trimmed: '" + custom + "'");
        System.out.println("Built-in Trimmed: '" + builtin + "'");
        System.out.println("Are both equal? " + compare(custom, builtin));
    }
}
