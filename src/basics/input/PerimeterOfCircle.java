package basics.input;
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        double perimeterOfCircle = 2 * Math.PI * radius;
        System.out.println("Perimeter of a circle is : " + perimeterOfCircle);
        sc.close();
    }

    
}
