/*
Total Surface area of Cube java program

Formula: 6 * a^2 
     Where:'a' is the length of one side (or edge) of the cube.
     
*/

package basics.controlflow;
import java.util.Scanner;

public class TSAOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        double side = in.nextDouble();
        double area = 6 * Math.pow(side, 2);
        System.out.println("The Total Surface Area is: " + area);
        in.close();
    }

}
