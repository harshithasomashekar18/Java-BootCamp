package com.day2;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square : ");
        double side = sc.nextDouble();
        double perimeterOfSquare = 4 * side; 
        System.out.println("Perimeter of a sqaure is : " + perimeterOfSquare);
        sc.close();
    }

    
}
