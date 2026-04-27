package basics.controlflow;

import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = input.nextDouble() / 100;

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = input.nextInt();

        System.out.print("Enter the number of years: ");
        int t = input.nextInt();

        // Formula: A = P * (1 + r/n)^(n*t)
        double amount = principal * Math.pow(1 + (rate / n), n * t);
        double compoundInterest = amount - principal;

        System.out.println("\n--- Results ---");
        System.out.printf("Total Amount (A): %.2f\n", amount);
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
        
        input.close();
    }
}
