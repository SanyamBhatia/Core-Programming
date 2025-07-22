import java.util.Scanner;

public class Add2numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int first = sc.nextInt();
        System.out.print("Enter second Number: ");
        int second = sc.nextInt();
        int result = first + second;
        System.out.print("Addition Of 2 Numbers is: " + result);
        sc.close();
    }
}
