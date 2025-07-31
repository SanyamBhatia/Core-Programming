import java.util.Scanner;

public class Level3Q3 {

    public static void findCharFrequency(String input) {
        boolean[] counted = new boolean[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (counted[i]) continue;

            char currentChar = input.charAt(i);
            int count = 1;

            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println("'" + currentChar + "' occurs " + count + " time(s)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        findCharFrequency(input);
    }
}
