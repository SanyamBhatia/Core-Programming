import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q4_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
