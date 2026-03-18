package com.day3;
import java.util.Scanner;

class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        if(num <= 1) {
            System.out.println("Its neither prime nor composite!");
        }
        int c = 2;
        while(c*c <= num){
            if(num % c == 0){
                System.out.println("Its a not prime number");
            }
           c += 1; 
        
        }
         System.out.println("Its a prime number");
 
        }
        
    }
