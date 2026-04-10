//Take 2 numbers as input and print the largest number.
package com.day2;
import java.util.Scanner;
public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2 :");
        int num2 = sc.nextInt();
        if(num1 > num2) {
            System.out.println(num1 +" " + "is the Largest");
        }else if (num2 > num1) {
            System.out.println(num2 +" " + "is the Largest");

        }else {
            System.out.println("Both numbers are equal");

        }

        sc.close();
        
    }
    
}
