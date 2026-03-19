package com.day2;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        if (num <= 1){
            System.out.println("Its neither prime nor composite");
        } else {
            boolean isPrime = true;
            int counter = 2;
            while(counter <= num) {
                if (counter * counter % num ==0){
                    isPrime = false;
                    System.out.println("It is not a Prime number");
                    break;
                }
                counter += 1;
            }
            if (isPrime){
                System.out.println("It is a prime number");
            }
        }

    }
}
