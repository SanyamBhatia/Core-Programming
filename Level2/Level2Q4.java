import java.util.Scanner;

public class Level2Q4 {

    public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int index = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;
        return words;
    }

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count++);
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] findMinMax(String[] words) {
        String min = words[0], max = words[0];
        for (String word : words) {
            if (getLength(word) < getLength(min)) min = word;
            if (getLength(word) > getLength(max)) max = word;
        }
        return new String[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[] minMax = findMinMax(words);

        System.out.println("Shortest word: " + minMax[0]);
        System.out.println("Longest word: " + minMax[1]);
    }
}
