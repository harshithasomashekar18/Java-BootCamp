package basics.controlflow;

import java.util.Scanner;

public class DBTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for Point 1
        System.out.print("Enter x1 and y1: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        // Input for Point 2
        System.out.print("Enter x2 and y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        // Calculation using Math.pow and Math.sqrt
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("The distance between the points is: %.2f", distance);
    }
    
}
