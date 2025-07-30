package Sir;
// inverse a number 21453
public class Selectivereverse {
    public static void main(String[] args) {
        int n = 984567132;
        int inverse = 0;
        int position = 1;

        while (n > 0) {
            int digit = n % 10;
            inverse += position * Math.pow(10, digit - 1);
            n /= 10;
            position++;
        }

        System.out.println("Inverse of the " + n +"is: " + inverse);
    }
}