/*
Curved surface area of a cylinder program
Formula: 2 * π * r * h 
*/

package basics.controlflow;

import java.util.Scanner;

public class CSAOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = in.nextDouble();
        double csa = 2 * Math.PI * radius * height;
        System.out.println("The Curved Surface Area is: " + csa);
        in.close();
    }
}
