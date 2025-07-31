import java.util.Scanner;

public class Level3Q2 {

    public static String getUniqueCharacters(String input) {
        String unique = "";

        for (int i = 0; ; i++) {
            try {
                char ch = input.charAt(i);
                boolean isUnique = true;

                for (int j = 0; ; j++) {
                    try {
                        if (i != j && ch == input.charAt(j)) {
                            isUnique = false;
                            break;
                        }
                    } catch (Exception e) {
                        break;
                    }
                }

                if (isUnique && unique.indexOf(ch) == -1) {
                    unique += ch;
                }

            } catch (Exception e) {
                break; // End of string
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String uniqueChars = getUniqueCharacters(input);
        System.out.println("Unique characters: " + uniqueChars);
    }
}
