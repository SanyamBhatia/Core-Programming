import java.util.Scanner;

public class Level2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] employeeData = new double[10][2]; // [][0]=salary, [][1]=years
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            double salary = sc.nextDouble();
            double years = sc.nextDouble();
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Re-enter.");
                i--; continue;
            }
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        for (int i = 0; i < 10; i++) {
            double bonusAmount = (employeeData[i][1] > 5) ? employeeData[i][0] * 0.05 : employeeData[i][0] * 0.02;
            bonus[i] = bonusAmount;
            newSalary[i] = employeeData[i][0] + bonusAmount;
            totalBonus += bonusAmount;
            totalOldSalary += employeeData[i][0];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
