import java.util.Scanner;

public class Level1Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number for FizzBuzz: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            return;
        }

        String[] results = new String[number + 1];
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
            }
        }

        System.out.println("FizzBuzz Result:");
        for (int i = 1; i <= number; i++) {
            System.out.println(results[i]);
        }
    }
}
