import java.util.Scanner;

public class Level1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " is positive and " + (num % 2 == 0 ? "even" : "odd"));
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("First and last numbers are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First number is greater than the last.");
        } else {
            System.out.println("First number is less than the last.");
        }
    }
}
