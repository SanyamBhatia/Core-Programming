public class Level2Q10 {

    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 51) + 50; // Physics
            scores[i][1] = (int)(Math.random() * 51) + 50; // Chemistry
            scores[i][2] = (int)(Math.random() * 51) + 50; // Math
        }
        return scores;
    }

    public static double[] calculatePercentage(int[] marks) {
        int total = marks[0] + marks[1] + marks[2];
        double percent = total / 3.0;
        return new double[]{total, percent};
    }

    public static String getGrade(double percent) {
        if (percent >= 90) return "A+";
        else if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        return "F";
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        System.out.println("Phy\tChem\tMath\tTotal\t%\tGrade");
        for (int[] student : scores) {
            double[] res = calculatePercentage(student);
            String grade = getGrade(res[1]);
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%s\n",
                student[0], student[1], student[2], res[0], res[1], grade);
        }
    }
}
