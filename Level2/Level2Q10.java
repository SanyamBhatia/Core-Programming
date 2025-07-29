import java.util.Scanner;

public class Level2Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[20];
        int index = 0;
        int temp = number;

        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        int[] freq = new int[10];
        for (int i = 0; i < index; i++) {
            freq[digits[i]]++;
        }

        System.out.println("Digit frequencies in number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + ": " + freq[i]);
            }
        }
    }
}
