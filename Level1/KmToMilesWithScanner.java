package Level1;
// Create a program to convert distance in kilometers to miles.
//Hint => 
//Create a variable km and assign type as double as in double km;
//Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
// Use Scanner Object to take user input for km as in km = input.nextInt();
// Use 1 mile = 1.6 km formulae to calculate miles and show the output
//use scanner to take user input for km as in km = input.nextDouble();
import java.util.Scanner;
public class KmToMilesWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble(); // Read user input for kilometers

        double miles = kilometers / 1.6; // Convert kilometers to miles using the conversion factor

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        input.close(); // Close the scanner to prevent resource leaks
    }
}
