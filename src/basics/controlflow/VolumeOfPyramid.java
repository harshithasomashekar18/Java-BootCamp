
/*
Volume of a pyramid program

Formula: (1/3) * Base Area * Height
 */

package basics.controlflow;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the base: ");
        double length = in.nextDouble();
        System.out.print("Enter the width of the base: ");
        double width = in.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        double height = in.nextDouble();
        double baseArea = length * width;
        double volume = (1.0 / 3.0) * baseArea * height;
        System.out.println("The Volume of the Pyramid is: " + volume);
        in.close();
    }
}
