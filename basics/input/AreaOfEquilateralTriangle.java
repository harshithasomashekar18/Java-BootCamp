package com.day2;
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the side:");
     double side = sc.nextDouble(); // The length of the side of the equilateral triangle
        
        // Calculate the area using the formula
        double area = (Math.sqrt(3) / 4) * (side * side);
        
        // Print the result
        System.out.println("The area of the equilateral triangle with side " + side + " is: " + area);

        sc.close();
    }
}
   

