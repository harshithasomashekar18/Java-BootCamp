/*
Volume of cylinder Program

Formula: π * r^2 * h
 */
package basics.controlflow;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = in.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The Volume of the Cylinder is: " + volume);
        in.close();
    }
}
