import java.util.Scanner;

public class Problem5_PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        if (isPalindrome(input))
            System.out.println("It's a palindrome.");
        else
            System.out.println("Not a palindrome.");
    }

    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine().replaceAll("\\s+", "").toLowerCase();
    }

    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right)
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        return true;
    }
}
