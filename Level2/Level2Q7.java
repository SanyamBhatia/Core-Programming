import java.util.Scanner;

public class Level2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // 0=weight, 1=height, 2=BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double w, h;
            do {
                System.out.println("Enter positive weight (kg) for person " + (i + 1) + ":");
                w = sc.nextDouble();
                if (w <= 0) System.out.println("Weight must be positive.");
            } while (w <= 0);

            do {
                System.out.println("Enter positive height (m) for person " + (i + 1) + ":");
                h = sc.nextDouble();
                if (h <= 0) System.out.println("Height must be positive.");
            } while (h <= 0);

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
