package Level1;
// The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted 
//amount and discounted price the student will pay for the course
public class Discount {
    public static void main(String[] args) {
        double courseFee = 125000.0; // Original course fee
        double discountRate = 0.10; // 10% discount

        double discountAmount = courseFee * discountRate; // Calculate the discount amount
        double discountedPrice = courseFee - discountAmount; // Calculate the final price after discount

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Discounted Price: " + discountedPrice);
    }
    
}
