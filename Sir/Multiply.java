package Sir;
public class Multiply {
    public static void main(String[] args) {
        int a = 6; // 110
        int b = 5; // 101

        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a; // using addition to multiply
        }

        System.out.println("Product of the numbers is: " + result);
    }    
}
