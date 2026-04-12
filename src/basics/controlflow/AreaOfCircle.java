/*
Area of a circle Program.

Formula:  area of a circle = π * r^2 .
*/

package basics.controlflow;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        double area = Math.PI*Math.pow(radius, 2); // double area = 3.14 * radius * radius;
        System.out.println("Area of the circle:" + area);
        sc.close();
    }
    
}
