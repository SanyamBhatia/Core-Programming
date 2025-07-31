import java.util.Arrays;
import java.util.Scanner;

public class Level3Q6 {

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) return false;

        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i);
            arr2[i] = str2.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
