import java.util.Scanner;

public class Level2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) and height (m) for person " + (i + 1) + ":");
            weights[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi[i] < 25)
                weightStatus[i] = "Normal";
            else if (bmi[i] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", heights[i], weights[i], bmi[i], weightStatus[i]);
        }
    }
}
