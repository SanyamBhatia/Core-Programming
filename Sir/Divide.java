package Sir;
//divide without using / operator
public class Divide {
    public static void main(String[] args) {
        int a = 20; // 10100
        int b = 4;  // 0100

        int result = 0;
        while (a >= b) {
            a -= b; // using subtraction to divide
            result++;
        }

        System.out.println("Quotient of the numbers is: " + result);
    }
}