/*
Grade Point Calculation: In many academic systems (like CBSE), the grade point for a subject is 
calculated by dividing the marks by 10.
Example: 95 marks becomes 9.5 Grade Points.

The Formula: CGPA = Σ(Grade Points of all subjects)\(Total number of subjects)

Percentage Conversion: To convert the CGPA back to a percentage, the standard
multiplier used in many regions is 9.5.

Example:
Enter the number of subjects: 3
Enter marks for subject 1: 90
Enter marks for subject 2: 80
Enter marks for subject 3: 70
Your CGPA is: 8.00Approximate Percentage: 76.00% 
*/

package basics.controlflow;
import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();

        double[] marks = new double[numSubjects];
        double totalGradePoints = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = input.nextDouble();
            
            // Converting marks to grade points (assuming a 10-point scale)
            // Logic: marks / 10
            totalGradePoints += (marks[i] / 10);
        }

        double cgpa = totalGradePoints / numSubjects;

        System.out.println("--- Results ---");
        System.out.printf("Your CGPA is: %.2f\n", cgpa);
        
        // Optional: Conversion to percentage (standard formula: CGPA * 9.5)
        double percentage = cgpa * 9.5;
        System.out.printf("Approximate Percentage: %.2f%%\n", percentage);
        
        input.close();
    }
    
}
