/*
Volume of a Cone Program

Formula: Volume of a cone = 1/3 * π * r^2 * h 

*/

package basics.controlflow;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double volume = (1.0 / 3) * Math.PI * r * r * h;
        System.out.println("Volume of Cone = " + volume);
        sc.close();
    }
    
}
