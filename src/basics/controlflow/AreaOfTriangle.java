/*
Area of a a Triangle program.

Formula: Area of a triangle = 1/2 * base * height  

*/

package basics.controlflow;
import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Area of a triangle calculator ---");
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of the Triangle is : " + area);
        sc.close();
    }
    
}
