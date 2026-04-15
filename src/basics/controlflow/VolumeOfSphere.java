/*
Volume of sphere program
Formula: (4/3) * π * r^3
 */

package basics.controlflow;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = in.nextDouble();   
        // Formula: (4/3) * π * r^3
        // Using 4.0/3.0 to ensure decimal precision     
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The Volume of the Sphere is: " + volume);
        in.close();
    }
}
