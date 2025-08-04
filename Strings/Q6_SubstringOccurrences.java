import java.util.Scanner;

public class Q6_SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring to find: ");
        String sub = sc.nextLine();

        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Occurrences of \"" + sub + "\": " + count);
        sc.close();
    }
}
