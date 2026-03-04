/*
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

The simple interest formula is : SI = P*T*R/100
SI = Simple Interest
P = Principal amount (initial investment/loan)
R = Annual interest rate (in percentage)
T = Time (typically in years)

Total Amount = Principal + Simple Interest

Key Details:

Calculation: Interest is calculated only on the original principal amount.

Monthly Time: If time is in months, divide by 12 (T/12) to convert to years.
Example: For 10,000 at 5%  for 3 years: (10,000 * 5 * 3)/100 = 1,500 interest.
Total Repayment: Principal + Interest (10,000 + 1,500)= 11,500. 
 */
package com.day2;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calulate your Simple Interest and Total Amount");
        System.err.println("Enter the Principal amount:");
        double principalAmount = sc.nextDouble();
        System.out.println("Enter the rate of interest in % per annum:");
        double rateOfInterest = sc.nextDouble();
        System.out.println("Enter the Time :");
        double time = sc.nextInt();
        System.out.println("Is this time in (1) Years or (2) Months? Enter 1 or 2: ");
        int choice = sc.nextInt();
        double t = time;
        if(choice == 2) {
             t = time/12.0;
        }
        double simpleInterest = (principalAmount * rateOfInterest * t) / 100;
        double totalAmount = simpleInterest + principalAmount;
        System.out.println("Simple Interest per is : " + simpleInterest);
        System.out.println("Total Amount is :" + totalAmount);
        
        sc.close();



        
    }

    
}
