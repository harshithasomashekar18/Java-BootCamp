package basics.controlflow;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        
        long result = 1; // Use long to handle larger results

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println("Factorial of " + n + " is: " + result);
        }
    }
    
}
