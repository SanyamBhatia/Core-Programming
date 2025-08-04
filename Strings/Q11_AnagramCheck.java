import java.util.Arrays;
import java.util.Scanner;

public class Q11_AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");
        sc.close();
    }
}
