/*
Perimeter of a rectangle program

Perimeter of a Rectangle: It is the total distance around the outside edge
Since a rectangle has two equal lengths and two equal widths, you simply add all four sides together.
The Concept: If you walk along the boundary of a rectangle, you cover the length (l) twice and the width (w) twice.
The Formula$$P = 2 * (length + width)
 */

package basics.controlflow;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Perimeter of Rectangle Calculator ---");
        System.out.print("Enter the length: ");
        double length = in.nextDouble();
        System.out.print("Enter the width: ");
        double width = in.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        
        in.close();
    }
}

