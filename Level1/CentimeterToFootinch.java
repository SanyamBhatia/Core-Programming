package Level1;
// Write a program that takes your height in centimeters and converts it into feet and inches
public class CentimeterToFootinch {
    public static void main(String[] args) {
        double centimeters = 170.0; // Example height in centimeters
        double inches = centimeters / 2.54; // Convert centimeters to inches
        int feet = (int) (inches / 12); // Calculate feet
        inches = inches % 12; // Remaining inches

        System.out.println(centimeters + " centimeters is equal to " + feet + " feet and " + inches + " inches.");
    }
    
}
