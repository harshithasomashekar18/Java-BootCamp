package com.day2;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a term to find a fibonacci number:");
        int n = sc.nextInt();
        int prev = 0;
        int current = 1;
        int count = 2;
        while (count <= n) {
            int temp = current;
            current = current + prev;
            prev = temp;
            count++;
            
        }
        System.out.println("Fibonacci number is :" +current);
        sc.close();
        
    }
    

    
}
