package Level1;
// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.

public class DividePens {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students; // Using integer division to find pens per student
        int remainingPens = totalPens % students; // Using modulus to find remaining pens

        System.out.println("Each student will get: " + pensPerStudent + " pens");
        System.out.println("Remaining non-distributed pens: " + remainingPens);
        
    }
}
