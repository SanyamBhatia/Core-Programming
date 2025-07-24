package Level1;
// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
// Hint => 
// Create a variable named fee and take user input for fee.
// Create another variable discountPercent and take user input.
// Compute the discount and assign it to the discount variable.
// Compute and print the fee you have to pay by subtracting the discount from the fee.

public class StudentDiscountInput {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in); // Create a Scanner object to read input

        System.out.print("Enter the course fee: ");
        double fee = input.nextDouble(); // Read user input for course fee

        System.out.print("Enter the discount percentage (e.g., 10 for 10%): ");
        double discountPercent = input.nextDouble(); // Read user input for discount percentage

        double discount = (discountPercent / 100) * fee; // Calculate the discount amount
        double finalFee = fee - discount; // Calculate the final fee after applying the discount

        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Fee to be paid: " + finalFee);

        input.close(); // Close the scanner to prevent resource leaks
    }
    
}
