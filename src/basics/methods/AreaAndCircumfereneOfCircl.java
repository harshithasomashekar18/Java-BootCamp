package basics.methods;
import java.util.Scanner;

public class AreaAndCircumfereneOfCircl {
    public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius ");
    int radius = sc.nextInt();
    //formula to calculate area of circle
    double area = Math.PI * (radius * radius);
    System.out.printf("Area is: %.2f", area);

    //formula to calculate circumference of circle
    double circumference= Math.PI * 2*radius;
    System.out.printf( "\nCircumference is: %.2f",circumference) ;
  }
    
}
