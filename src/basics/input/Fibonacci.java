package basics.input;
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

/*
package com.day2;

import java.util.Scanner;

public class FibonacciSeries {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + (i < n ? ", " : ""));

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        scanner.close(); 
      }
    
}
 */
