import java.util.Scanner;

public class Level2Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks (0-100) for Physics, Chemistry, Maths of student " + (i + 1) + ":");
            double p = sc.nextDouble();
            double c = sc.nextDouble();
            double m = sc.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Marks cannot be negative. Re-enter student " + (i + 1));
                i--;
                continue;
            }
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        for (int i = 0; i < n; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percentage[i] >= 90) grades[i] = "A";
            else if (percentage[i] >= 75) grades[i] = "B";
            else if (percentage[i] >= 50) grades[i] = "C";
            else grades[i] = "F";
        }

        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f\t\t%s\n",
                    physics[i], chemistry[i], maths[i], percentage[i], grades[i]);
        }
    }
}
