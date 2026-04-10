//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

package com.day1;
import java.util.Scanner;

public class SumOfMultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (or 'x' to see the sum ):");
        int total = 0;
        while(true) {
            if(sc.hasNextInt()) {
                total += sc.nextInt();
            }
            else {
                String input = sc.next();
                if(input.equalsIgnoreCase("x")){
                    break;
                }
                else {
                    System.out.println("Invalid input. Enter number or X.");
                }
            }
        }
        System.out.println("Total Sum : " + total);
        sc.close();
    }

    
}
