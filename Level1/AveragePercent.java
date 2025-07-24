package Level1;
// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
public class AveragePercent {
    public static void main(String[] args) {
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        int totalMarks = mathsMark + physicsMark + chemistryMark;
        double averagePercent = (totalMarks / 3.0); // Using 3.0 to ensure floating-point division

        System.out.println("Average percent mark in PCM is: " + averagePercent + "%");
    }
}
