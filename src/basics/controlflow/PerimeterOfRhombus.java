/*
 Rhombus is a quadrilateral where all four sides are of equal length.
 The Formula If 'a' represents the length of one side, the formula for the perimeter P is:
 P = 4 * a
 */

package basics.controlflow;
import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of a side of the rhombus: ");
        double side = in.nextDouble();
        double perimeter = 4 * side;
        System.out.println("The perimeter of the rhombus is: " + perimeter);
        in.close();
    }

    
}