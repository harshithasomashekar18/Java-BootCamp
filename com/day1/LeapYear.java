/*
Question: Input a year and find whether it is a leap year or not.
 */
package com.day1;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        } 
    }
    
}
