/*
Area Of Isosceles Triangle Program

Isosceles Triangle:A triangle with at least two sides of equal length.
Formula : Area Of Isosceles Triangle = 1/2 * b √ a^2 - b^2 / 4
where 
  b is the base (the unequal side).
  a is the length of the two equal sides.
  */

package basics.controlflow;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter equal side (a): ");
        double a = in.nextDouble();

        System.out.print("Enter base (b): ");
        double b = in.nextDouble();

        // Using your exact formula
        double area = 0.5 * b * Math.sqrt((a * a) - (b * b / 4));

        System.out.println("The area is: " + area);

        in.close();
    }
    
}
