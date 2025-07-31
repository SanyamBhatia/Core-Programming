public class Level1Q8 {
    public static void generateException(String[] names) {
        System.out.println(names[10]); // May throw exception
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        // generateException(names); // Uncomment to test crash
        handleException(names);
        
    }
}
