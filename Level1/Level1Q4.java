public class Level1Q4 {
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length()); // Throws NullPointerException
    }

    public static void handleNullPointerException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateNullPointerException(); // Uncomment to test crash
        handleNullPointerException();
        
    }
}
