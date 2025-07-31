import java.util.Scanner;

public class Level3Q1 {
    
    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);

            String status = "";
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.format("%.1f", heightCm);
            result[i][1] = String.format("%.1f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display the result
    public static void display(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][2];

        System.out.println("Enter height (cm) and weight (kg) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            teamData[i][1] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
        }

        String[][] result = calculateBMI(teamData);
        display(result);
    }
}
