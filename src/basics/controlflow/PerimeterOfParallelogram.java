/*
To calculate the Perimeter of a Parallelogram, you need to add the lengths of all four sides. 
Since opposite sides of a parallelogram are equal, the process is similar to finding the perimeter of a rectangle.

The FormulaIf 'a' represents the length of the base and 'b' represents the length of the side (slant height), 
the formula for the perimeter $P$ is:$$P = 2 * (a + b)
 */

package basics.controlflow;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        double base = in.nextDouble();
        System.out.print("Enter the side (b): ");
        double side = in.nextDouble();
        double perimeter = 2 * (base + side);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
    }
    
}
