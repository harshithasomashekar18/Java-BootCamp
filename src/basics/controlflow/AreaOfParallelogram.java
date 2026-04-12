/*
Area Of Parallelogram program

Paralleogram: It is a simple quadrilateral with two pairs of parallel sides.
Unlike a triangle, you do not divide by 2. This is because a parallelogram can be rearranged into a rectangle with the same base and height.

Formula : Area = base * height
*/

package basics.controlflow;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Area of Parallelogram ---");
        System.out.print("Enter the base: ");
        double base = in.nextDouble();
        System.out.print("Enter the height: ");
        double height = in.nextDouble();
        double area = base * height;
        System.out.println("The area of the parallelogram is: " + area);
        in.close();
    
    }
}
