/*
Perimeter of a Equilateral triangle Program.

Formula: Perimeter of Triangle = 3 * a 
 where 'a' repersents the length of one side since its equilateral triangle all three sides are equal

 Key Properties
* All sides are equal: If you know one side, you know them all.

* All angles are equal: Each internal angle is exactly 60°.

* Units: The perimeter will always be in the same linear unit as the side (e.g., cm, meters, inches).

*/
package basics.controlflow;
import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle :");
        double side = sc.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of a Equilateral Triangle: " + perimeter);
    }
    
}
