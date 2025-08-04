import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9_MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        char mostFreqChar = 0;
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFreqChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most Frequent Character: '" + mostFreqChar + "'");
        sc.close();
    }
}
