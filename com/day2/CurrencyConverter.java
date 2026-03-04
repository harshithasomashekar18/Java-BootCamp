/*
Input currency in rupees and output in USD.

To convert Indian Rupees (INR) to US Dollars (USD), use this formula:
USD Amount = INR Amount × Exchange Rate 
Exchange rate at present is  0.01085
USD(United States Dollar)
 */
package com.day2;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double indianRupee, exchangeRate, usd;
        System.out.println("Enter  amount in indian rupee:");
        indianRupee = scanner.nextDouble();
        exchangeRate = 0.01085;
        usd = indianRupee * exchangeRate;
        System.out.printf("Your amount in USD is :  $%.2f%n" , usd );

        scanner.close();
    }
    
}
