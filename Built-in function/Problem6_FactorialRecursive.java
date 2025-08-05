import java.util.Scanner;

public class Problem6_FactorialRecursive {
    public static void main(String[] args) {
        int num = getInput();
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

    static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
