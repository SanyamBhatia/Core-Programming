package Sir;
// subtract without using - operator
public class Sub {
    public static void main(String[] args) {
        int a = 27;
        int b = 15; 
        int result = a + (~b + 1);
        System.out.println("Difference of the numbers is: " + result);

    }
}
