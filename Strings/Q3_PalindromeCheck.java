import java.util.Scanner;

public class Q3_PalindromeCheck {
    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        if (input.equals(reverse(input)))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
        sc.close();
    }
}
