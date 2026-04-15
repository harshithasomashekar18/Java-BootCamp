/*
Volume of prism program

Formula: Volume = Base Area * Height
 */

package basics.controlflow;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base area of the prism: ");
        double baseArea = in.nextDouble();
        System.out.print("Enter the height of the prism: ");
        double height = in.nextDouble();
        double volume = baseArea * height;
        System.out.println("The Volume of the Prism is: " + volume);
        in.close();
    }
}
