import java.util.Scanner;

public class Q10_RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch)
                sb.append(c);
        }

        System.out.println("Modified String: " + sb.toString());
        sc.close();
    }
}
