import java.util.Scanner;

public class Level3Q10 {

    public static String bmiCategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("Category: " + bmiCategory(bmi));
    }
}
