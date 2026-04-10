package com.day2;
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first diagonal (d1):");
        double d1 = sc.nextDouble();
        
        System.out.println("Enter the length of the second diagonal (d2):");
        double d2 = sc.nextDouble();
        
        // Calculate the area
        double area = (d1 * d2) / 2;
        
        // Print the result
        System.out.println("Area of the rhombus is: " + area);
        
        sc.close();
    }
    
}
